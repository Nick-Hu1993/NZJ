/**
 * bootstrap-switch - Turn checkboxes and radio buttons into toggle switches.
 *
 * @version v3.3.4
 * @homepage https://bttstrp.github.io/bootstrap-switch
 * @author Mattia Larentis <mattia@larentis.eu> (http://larentis.eu)
 * @license Apache-2.0
 */

(function(global, factory) {
	if(typeof define === "function" && define.amd) {
		define(['jquery'], factory);
	} else if(typeof exports !== "undefined") {
		factory(require('jquery'));
	} else {
		var mod = {
			exports: {}
		};
		factory(global.jquery);
		global.bootstrapSwitch = mod.exports;
	}
})(this, function(_jquery) {
	'use strict';

	var _jquery2 = _interopRequireDefault(_jquery);

	function _interopRequireDefault(obj) {
		return obj && obj.__esModule ? obj : {
			default: obj
		};
	}

	var _extends = Object.assign || function(target) {
		for(var i = 1; i < arguments.length; i++) {
			var source = arguments[i];

			for(var key in source) {
				if(Object.prototype.hasOwnProperty.call(source, key)) {
					target[key] = source[key];
				}
			}
		}

		return target;
	};

	function _classCallCheck(instance, Constructor) {
		if(!(instance instanceof Constructor)) {
			throw new TypeError("Cannot call a class as a function");
		}
	}

	var _createClass = function() {
		function defineProperties(target, props) {
			for(var i = 0; i < props.length; i++) {
				var descriptor = props[i];
				descriptor.enumerable = descriptor.enumerable || false;
				descriptor.configurable = true;
				if("value" in descriptor) descriptor.writable = true;
				Object.defineProperty(target, descriptor.key, descriptor);
			}
		}

		return function(Constructor, protoProps, staticProps) {
			if(protoProps) defineProperties(Constructor.prototype, protoProps);
			if(staticProps) defineProperties(Constructor, staticProps);
			return Constructor;
		};
	}();

	var $ = _jquery2.default || window.jQuery || window.$;

	var BootstrapSwitch = function() {
		function BootstrapSwitch(element) {
			var _this = this;

			var options = arguments.length > 1 && arguments[1] !== undefined ? arguments[1] : {};

			_classCallCheck(this, BootstrapSwitch);

			this.$element = $(element);
			this.options = $.extend({}, $.fn.bootstrapSwitch.defaults, this._getElementOptions(), options);
			this.prevOptions = {};
			this.$wrapper = $('<div>', {
				class: function _class() {
					var classes = [];
					classes.push(_this.options.state ? 'on' : 'off');
					if(_this.options.size) {
						classes.push(_this.options.size);
					}
					if(_this.options.disabled) {
						classes.push('disabled');
					}
					if(_this.options.readonly) {
						classes.push('readonly');
					}
					if(_this.options.indeterminate) {
						classes.push('indeterminate');
					}
					if(_this.options.inverse) {
						classes.push('inverse');
					}
					if(_this.$element.attr('id')) {
						classes.push('id-' + _this.$element.attr('id'));
					}
					return classes.map(_this._getClass.bind(_this)).concat([_this.options.baseClass], _this._getClasses(_this.options.wrapperClass)).join(' ');
				}
			});
			this.$container = $('<div>', {
				class: this._getClass('container')
			});
			this.$on = $('<span>', {
				html: this.options.onText,
				class: this._getClass('handle-on') + ' ' + this._getClass(this.options.onColor)
			});
			this.$off = $('<span>', {
				html: this.options.offText,
				class: this._getClass('handle-off') + ' ' + this._getClass(this.options.offColor)
			});
			this.$label = $('<span>', {
				html: this.options.labelText,
				class: this._getClass('label')
			});

			this.$element.on('init.bootstrapSwitch', this.options.onInit.bind(this, element));
			this.$element.on('switchChange.bootstrapSwitch', function() {
				for(var _len = arguments.length, args = Array(_len), _key = 0; _key < _len; _key++) {
					args[_key] = arguments[_key];
				}

				if(_this.options.onSwitchChange.apply(element, args) === false) {
					if(_this.$element.is(':radio')) {
						$('[name="' + _this.$element.attr('name') + '"]').trigger('previousState.bootstrapSwitch', true);
					} else {
						_this.$element.trigger('previousState.bootstrapSwitch', true);
					}
				}
			});

			this.$container = this.$element.wrap(this.$container).parent();
			this.$wrapper = this.$container.wrap(this.$wrapper).parent();
			this.$element.before(this.options.inverse ? this.$off : this.$on).before(this.$label).before(this.options.inverse ? this.$on : this.$off);

			if(this.options.indeterminate) {
				this.$element.prop('indeterminate', true);
			}

			this._init();
			this._elementHandlers();
			this._handleHandlers();
			this._labelHandlers();
			this._formHandler();
			this._externalLabelHandler();
			this.$element.trigger('init.bootstrapSwitch', this.options.state);
		}

		_createClass(BootstrapSwitch, [{
			key: 'setPrevOptions',
			value: function setPrevOptions() {
				this.prevOptions = _extends({}, this.options);
			}
		}, {
			key: 'state',
			value: function state(value, skip) {
				if(typeof value === 'undefined') {
					return this.options.state;
				}
				if(this.options.disabled || this.options.readonly || this.options.state && !this.options.radioAllOff && this.$element.is(':radio')) {
					return this.$element;
				}
				if(this.$element.is(':radio')) {
					$('[name="' + this.$element.attr('name') + '"]').trigger('setPreviousOptions.bootstrapSwitch');
				} else {
					this.$element.trigger('setPreviousOptions.bootstrapSwitch');
				}
				if(this.options.indeterminate) {
					this.indeterminate(false);
				}
				this.$element.prop('checked', Boolean(value)).trigger('change.bootstrapSwitch', skip);
				return this.$element;
			}
		}, {
			key: 'toggleState',
			value: function toggleState(skip) {
				if(this.options.disabled || this.options.readonly) {
					return this.$element;
				}
				if(this.options.indeterminate) {
					this.indeterminate(false);
					return this.state(true);
				} else {
					return this.$element.prop('checked', !this.options.state).trigger('change.bootstrapSwitch', skip);
				}
			}
		}, {
			key: 'size',
			value: function size(value) {
				if(typeof value === 'undefined') {
					return this.options.size;
				}
				if(this.options.size != null) {
					this.$wrapper.removeClass(this._getClass(this.options.size));
				}
				if(value) {
					this.$wrapper.addClass(this._getClass(value));
				}
				this._width();
				this._containerPosition();
				this.options.size = value;
				return this.$element;
			}
		}, {
			key: 'animate',
			value: function animate(value) {
				if(typeof value === 'undefined') {
					return this.options.animate;
				}
				if(this.options.animate === Boolean(value)) {
					return this.$element;
				}
				return this.toggleAnimate();
			}
		}, {
			key: 'toggleAnimate',
			value: function toggleAnimate() {
				this.options.animate = !this.options.animate;
				this.$wrapper.toggleClass(this._getClass('animate'));
				return this.$element;
			}
		}, {
			key: 'disabled',
			value: function disabled(value) {
				if(typeof value === 'undefined') {
					return this.options.disabled;
				}
				if(this.options.disabled === Boolean(value)) {
					return this.$element;
				}
				return this.toggleDisabled();
			}
		}, {
			key: 'toggleDisabled',
			value: function toggleDisabled() {
				this.options.disabled = !this.options.disabled;
				this.$element.prop('disabled', this.options.disabled);
				this.$wrapper.toggleClass(this._getClass('disabled'));
				return this.$element;
			}
		}, {
			key: 'readonly',
			value: function readonly(value) {
				if(typeof value === 'undefined') {
					return this.options.readonly;
				}
				if(this.options.readonly === Boolean(value)) {
					return this.$element;
				}
				return this.toggleReadonly();
			}
		}, {
			key: 'toggleReadonly',
			value: function toggleReadonly() {
				this.options.readonly = !this.options.readonly;
				this.$element.prop('readonly', this.options.readonly);
				this.$wrapper.toggleClass(this._getClass('readonly'));
				return this.$element;
			}
		}, {
			key: 'indeterminate',
			value: function indeterminate(value) {
				if(typeof value === 'undefined') {
					return this.options.indeterminate;
				}
				if(this.options.indeterminate === Boolean(value)) {
					return this.$element;
				}
				return this.toggleIndeterminate();
			}
		}, {
			key: 'toggleIndeterminate',
			value: function toggleIndeterminate() {
				this.options.indeterminate = !this.options.indeterminate;
				this.$element.prop('indeterminate', this.options.indeterminate);
				this.$wrapper.toggleClass(this._getClass('indeterminate'));
				this._containerPosition();
				return this.$element;
			}
		}, {
			key: 'inverse',
			value: function inverse(value) {
				if(typeof value === 'undefined') {
					return this.options.inverse;
				}
				if(this.options.inverse === Boolean(value)) {
					return this.$element;
				}
				return this.toggleInverse();
			}
		}, {
			key: 'toggleInverse',
			value: function toggleInverse() {
				this.$wrapper.toggleClass(this._getClass('inverse'));
				var $on = this.$on.clone(true);
				var $off = this.$off.clone(true);
				this.$on.replaceWith($off);
				this.$off.replaceWith($on);
				this.$on = $off;
				this.$off = $on;
				this.options.inverse = !this.options.inverse;
				return this.$element;
			}
		}, {
			key: 'onColor',
			value: function onColor(value) {
				if(typeof value === 'undefined') {
					return this.options.onColor;
				}
				if(this.options.onColor) {
					this.$on.removeClass(this._getClass(this.options.onColor));
				}
				this.$on.addClass(this._getClass(value));
				this.options.onColor = value;
				return this.$element;
			}
		}, {
			key: 'offColor',
			value: function offColor(value) {
				if(typeof value === 'undefined') {
					return this.options.offColor;
				}
				if(this.options.offColor) {
					this.$off.removeClass(this._getClass(this.options.offColor));
				}
				this.$off.addClass(this._getClass(value));
				this.options.offColor = value;
				return this.$element;
			}
		}, {
			key: 'onText',
			value: function onText(value) {
				if(typeof value === 'undefined') {
					return this.options.onText;
				}
				this.$on.html(value);
				this._width();
				this._containerPosition();
				this.options.onText = value;
				return this.$element;
			}
		}, {
			key: 'offText',
			value: function offText(value) {
				if(typeof value === 'undefined') {
					return this.options.offText;
				}
				this.$off.html(value);
				this._width();
				this._containerPosition();
				this.options.offText = value;
				return this.$element;
			}
		}, {
			key: 'labelText',
			value: function labelText(value) {
				if(typeof value === 'undefined') {
					return this.options.labelText;
				}
				this.$label.html(value);
				this._width();
				this.options.labelText = value;
				return this.$element;
			}
		}, {
			key: 'handleWidth',
			value: function handleWidth(value) {
				if(typeof value === 'undefined') {
					return this.options.handleWidth;
				}
				this.options.handleWidth = value;
				this._width();
				this._containerPosition();
				return this.$element;
			}
		}, {
			key: 'labelWidth',
			value: function labelWidth(value) {
				if(typeof value === 'undefined') {
					return this.options.labelWidth;
				}
				this.options.labelWidth = value;
				this._width();
				this._containerPosition();
				return this.$element;
			}
		}, {
			key: 'baseClass',
			value: function baseClass(value) {
				return this.options.baseClass;
			}
		}, {
			key: 'wrapperClass',
			value: function wrapperClass(value) {
				if(typeof value === 'undefined') {
					return this.options.wrapperClass;
				}
				if(!value) {
					value = $.fn.bootstrapSwitch.defaults.wrapperClass;
				}
				this.$wrapper.removeClass(this._getClasses(this.options.wrapperClass).join(' '));
				this.$wrapper.addClass(this._getClasses(value).join(' '));
				this.options.wrapperClass = value;
				return this.$element;
			}
		}, {
			key: 'radioAllOff',
			value: function radioAllOff(value) {
				if(typeof value === 'undefined') {
					return this.options.radioAllOff;
				}
				var val = Boolean(value);
				if(this.options.radioAllOff === val) {
					return this.$element;
				}
				this.options.radioAllOff = val;
				return this.$element;
			}
		}, {
			key: 'onInit',
			value: function onInit(value) {
				if(typeof value === 'undefined') {
					return this.options.onInit;
				}
				if(!value) {
					value = $.fn.bootstrapSwitch.defaults.onInit;
				}
				this.options.onInit = value;
				return this.$element;
			}
		}, {
			key: 'onSwitchChange',
			value: function onSwitchChange(value) {
				if(typeof value === 'undefined') {
					return this.options.onSwitchChange;
				}
				if(!value) {
					value = $.fn.bootstrapSwitch.defaults.onSwitchChange;
				}
				this.options.onSwitchChange = value;
				return this.$element;
			}
		}, {
			key: 'destroy',
			value: function destroy() {
				var $form = this.$element.closest('form');
				if($form.length) {
					$form.off('reset.bootstrapSwitch').removeData('bootstrap-switch');
				}
				this.$container.children().not(this.$element).remove();
				this.$element.unwrap().unwrap().off('.bootstrapSwitch').removeData('bootstrap-switch');
				return this.$element;
			}
		}, {
			key: '_getElementOptions',
			value: function _getElementOptions() {
				return {
					state: this.$element.is(':checked'),
					size: this.$element.data('size'),
					animate: this.$element.data('animate'),
					disabled: this.$element.is(':disabled'),
					readonly: this.$element.is('[readonly]'),
					indeterminate: this.$element.data('indeterminate'),
					inverse: this.$element.data('inverse'),
					radioAllOff: this.$element.data('radio-all-off'),
					onColor: this.$element.data('on-color'),
					offColor: this.$element.data('off-color'),
					onText: this.$element.data('on-text'),
					offText: this.$element.data('off-text'),
					labelText: this.$element.data('label-text'),
					handleWidth: this.$element.data('handle-width'),
					labelWidth: this.$element.data('label-width'),
					baseClass: this.$element.data('base-class'),
					wrapperClass: this.$element.data('wrapper-class')
				};
			}
		}, {
			key: '_width',
			value: function _width() {
				var _this2 = this;

				var $handles = this.$on.add(this.$off).add(this.$label).css('width', '');
				var handleWidth = this.options.handleWidth === 'auto' ? Math.round(Math.max(this.$on.width(), this.$off.width())) : this.options.handleWidth;
				$handles.width(handleWidth);
				this.$label.width(function(index, width) {
					if(_this2.options.labelWidth !== 'auto') {
						return _this2.options.labelWidth;
					}
					if(width < handleWidth) {
						return handleWidth;
					}
					return width;
				});
				this._handleWidth = this.$on.outerWidth();
				this._labelWidth = this.$label.outerWidth();
				this.$container.width(this._handleWidth * 2 + this._labelWidth);
				return this.$wrapper.width(this._handleWidth + this._labelWidth);
			}
		}, {
			key: '_containerPosition',
			value: function _containerPosition() {
				var _this3 = this;

				var state = arguments.length > 0 && arguments[0] !== undefined ? arguments[0] : this.options.state;
				var callback = arguments[1];

				this.$container.css('margin-left', function() {
					var values = [0, '-' + _this3._handleWidth + 'px'];
					if(_this3.options.indeterminate) {
						return '-' + _this3._handleWidth / 2 + 'px';
					}
					if(state) {
						if(_this3.options.inverse) {
							return values[1];
						} else {
							return values[0];
						}
					} else {
						if(_this3.options.inverse) {
							return values[0];
						} else {
							return values[1];
						}
					}
				});
			}
		}, {
			key: '_init',
			value: function _init() {
				var _this4 = this;

				var init = function init() {
					_this4.setPrevOptions();
					_this4._width();
					_this4._containerPosition();
					setTimeout(function() {
						if(_this4.options.animate) {
							return _this4.$wrapper.addClass(_this4._getClass('animate'));
						}
					}, 50);
				};
				if(this.$wrapper.is(':visible')) {
					init();
					return;
				}
				var initInterval = window.setInterval(function() {
					if(_this4.$wrapper.is(':visible')) {
						init();
						return window.clearInterval(initInterval);
					}
				}, 50);
			}
		}, {
			key: '_elementHandlers',
			value: function _elementHandlers() {
				var _this5 = this;

				return this.$element.on({
					'setPreviousOptions.bootstrapSwitch': this.setPrevOptions.bind(this),

					'previousState.bootstrapSwitch': function previousStateBootstrapSwitch() {
						_this5.options = _this5.prevOptions;
						if(_this5.options.indeterminate) {
							_this5.$wrapper.addClass(_this5._getClass('indeterminate'));
						}
						_this5.$element.prop('checked', _this5.options.state).trigger('change.bootstrapSwitch', true);
					},

					'change.bootstrapSwitch': function changeBootstrapSwitch(event, skip) {
						event.preventDefault();
						event.stopImmediatePropagation();
						var state = _this5.$element.is(':checked');
						_this5._containerPosition(state);
						if(state === _this5.options.state) {
							return;
						}
						_this5.options.state = state;
						_this5.$wrapper.toggleClass(_this5._getClass('off')).toggleClass(_this5._getClass('on'));
						if(!skip) {
							if(_this5.$element.is(':radio')) {
								$('[name="' + _this5.$element.attr('name') + '"]').not(_this5.$element).prop('checked', false).trigger('change.bootstrapSwitch', true);
							}
							_this5.$element.trigger('switchChange.bootstrapSwitch', [state]);
						}
					},

					'focus.bootstrapSwitch': function focusBootstrapSwitch(event) {
						event.preventDefault();
						_this5.$wrapper.addClass(_this5._getClass('focused'));
					},

					'blur.bootstrapSwitch': function blurBootstrapSwitch(event) {
						event.preventDefault();
						_this5.$wrapper.removeClass(_this5._getClass('focused'));
					},

					'keydown.bootstrapSwitch': function keydownBootstrapSwitch(event) {
						if(!event.which || _this5.options.disabled || _this5.options.readonly) {
							return;
						}
						if(event.which === 37 || event.which === 39) {
							event.preventDefault();
							event.stopImmediatePropagation();
							_this5.state(event.which === 39);
						}
					}
				});
			}
		}, {
			key: '_handleHandlers',
			value: function _handleHandlers() {
				var _this6 = this;

				this.$on.on('click.bootstrapSwitch', function(event) {
					event.preventDefault();
					event.stopPropagation();
					_this6.state(false);
					return _this6.$element.trigger('focus.bootstrapSwitch');
				});
				return this.$off.on('click.bootstrapSwitch', function(event) {
					event.preventDefault();
					event.stopPropagation();
					_this6.state(true);
					return _this6.$element.trigger('focus.bootstrapSwitch');
				});
			}
		}, {
			key: '_labelHandlers',
			value: function _labelHandlers() {
				var _this7 = this;

				var handlers = {
					click: function click(event) {
						event.stopPropagation();
					},

					'mousedown.bootstrapSwitch touchstart.bootstrapSwitch': function mousedownBootstrapSwitchTouchstartBootstrapSwitch(event) {
						if(_this7._dragStart || _this7.options.disabled || _this7.options.readonly) {
							return;
						}
						event.preventDefault();
						event.stopPropagation();
						_this7._dragStart = (event.pageX || event.originalEvent.touches[0].pageX) - parseInt(_this7.$container.css('margin-left'), 10);
						if(_this7.options.animate) {
							_this7.$wrapper.removeClass(_this7._getClass('animate'));
						}
						_this7.$element.trigger('focus.bootstrapSwitch');
					},

					'mousemove.bootstrapSwitch touchmove.bootstrapSwitch': function mousemoveBootstrapSwitchTouchmoveBootstrapSwitch(event) {
						if(_this7._dragStart == null) {
							return;
						}
						var difference = (event.pageX || event.originalEvent.touches[0].pageX) - _this7._dragStart;
						event.preventDefault();
						if(difference < -_this7._handleWidth || difference > 0) {
							return;
						}
						_this7._dragEnd = difference;
						_this7.$container.css('margin-left', _this7._dragEnd + 'px');
					},

					'mouseup.bootstrapSwitch touchend.bootstrapSwitch': function mouseupBootstrapSwitchTouchendBootstrapSwitch(event) {
						if(!_this7._dragStart) {
							return;
						}
						event.preventDefault();
						if(_this7.options.animate) {
							_this7.$wrapper.addClass(_this7._getClass('animate'));
						}
						if(_this7._dragEnd) {
							var state = _this7._dragEnd > -(_this7._handleWidth / 2);
							_this7._dragEnd = false;
							_this7.state(_this7.options.inverse ? !state : state);
						} else {
							_this7.state(!_this7.options.state);
						}
						_this7._dragStart = false;
					},

					'mouseleave.bootstrapSwitch': function mouseleaveBootstrapSwitch() {
						_this7.$label.trigger('mouseup.bootstrapSwitch');
					}
				};
				this.$label.on(handlers);
			}
		}, {
			key: '_externalLabelHandler',
			value: function _externalLabelHandler() {
				var _this8 = this;

				var $externalLabel = this.$element.closest('label');
				$externalLabel.on('click', function(event) {
					event.preventDefault();
					event.stopImmediatePropagation();
					if(event.target === $externalLabel[0]) {
						_this8.toggleState();
					}
				});
			}
		}, {
			key: '_formHandler',
			value: function _formHandler() {
				var $form = this.$element.closest('form');
				if($form.data('bootstrap-switch')) {
					return;
				}
				$form.on('reset.bootstrapSwitch', function() {
					window.setTimeout(function() {
						$form.find('input').filter(function() {
							return $(this).data('bootstrap-switch');
						}).each(function() {
							return $(this).bootstrapSwitch('state', this.checked);
						});
					}, 1);
				}).data('bootstrap-switch', true);
			}
		}, {
			key: '_getClass',
			value: function _getClass(name) {
				return this.options.baseClass + '-' + name;
			}
		}, {
			key: '_getClasses',
			value: function _getClasses(classes) {
				if(!$.isArray(classes)) {
					return [this._getClass(classes)];
				}
				return classes.map(this._getClass.bind(this));
			}
		}]);

		return BootstrapSwitch;
	}();

	$.fn.bootstrapSwitch = function(option) {
		for(var _len2 = arguments.length, args = Array(_len2 > 1 ? _len2 - 1 : 0), _key2 = 1; _key2 < _len2; _key2++) {
			args[_key2 - 1] = arguments[_key2];
		}

		function reducer(ret, next) {
			var $this = $(next);
			var existingData = $this.data('bootstrap-switch');
			var data = existingData || new BootstrapSwitch(next, option);
			if(!existingData) {
				$this.data('bootstrap-switch', data);
			}
			if(typeof option === 'string') {
				return data[option].apply(data, args);
			}
			return ret;
		}
		return Array.prototype.reduce.call(this, reducer, this);
	};
	$.fn.bootstrapSwitch.Constructor = BootstrapSwitch;
	$.fn.bootstrapSwitch.defaults = {
		state: true,
		size: null,
		animate: true,
		disabled: false,
		readonly: false,
		indeterminate: false,
		inverse: false,
		radioAllOff: false,
		onColor: 'primary',
		offColor: 'default',
		onText: 'ON',
		offText: 'OFF',
		labelText: '&nbsp',
		handleWidth: 'auto',
		labelWidth: 'auto',
		baseClass: 'bootstrap-switch',
		wrapperClass: 'wrapper',
		onInit: function onInit() {},
		onSwitchChange: function onSwitchChange() {}
	};
});

var hljs = new function() {
	function k(v) {
		return v.replace(/&/gm, "&amp;").replace(/</gm, "&lt;").replace(/>/gm, "&gt;")
	}

	function t(v) {
		return v.nodeName.toLowerCase()
	}

	function i(w, x) {
		var v = w && w.exec(x);
		return v && v.index == 0
	}

	function d(v) {
		return Array.prototype.map.call(v.childNodes, function(w) {
			if(w.nodeType == 3) {
				return b.useBR ? w.nodeValue.replace(/\n/g, "") : w.nodeValue
			}
			if(t(w) == "br") {
				return "\n"
			}
			return d(w)
		}).join("")
	}

	function r(w) {
		var v = (w.className + " " + (w.parentNode ? w.parentNode.className : "")).split(/\s+/);
		v = v.map(function(x) {
			return x.replace(/^language-/, "")
		});
		return v.filter(function(x) {
			return j(x) || x == "no-highlight"
		})[0]
	}

	function o(x, y) {
		var v = {};
		for(var w in x) {
			v[w] = x[w]
		}
		if(y) {
			for(var w in y) {
				v[w] = y[w]
			}
		}
		return v
	}

	function u(x) {
		var v = [];
		(function w(y, z) {
			for(var A = y.firstChild; A; A = A.nextSibling) {
				if(A.nodeType == 3) {
					z += A.nodeValue.length
				} else {
					if(t(A) == "br") {
						z += 1
					} else {
						if(A.nodeType == 1) {
							v.push({
								event: "start",
								offset: z,
								node: A
							});
							z = w(A, z);
							v.push({
								event: "stop",
								offset: z,
								node: A
							})
						}
					}
				}
			}
			return z
		})(x, 0);
		return v
	}

	function q(w, y, C) {
		var x = 0;
		var F = "";
		var z = [];

		function B() {
			if(!w.length || !y.length) {
				return w.length ? w : y
			}
			if(w[0].offset != y[0].offset) {
				return(w[0].offset < y[0].offset) ? w : y
			}
			return y[0].event == "start" ? w : y
		}

		function A(H) {
			function G(I) {
				return " " + I.nodeName + '="' + k(I.value) + '"'
			}
			F += "<" + t(H) + Array.prototype.map.call(H.attributes, G).join("") + ">"
		}

		function E(G) {
			F += "</" + t(G) + ">"
		}

		function v(G) {
			(G.event == "start" ? A : E)(G.node)
		}
		while(w.length || y.length) {
			var D = B();
			F += k(C.substr(x, D[0].offset - x));
			x = D[0].offset;
			if(D == w) {
				z.reverse().forEach(E);
				do {
					v(D.splice(0, 1)[0]);
					D = B()
				} while (D == w && D.length && D[0].offset == x);
				z.reverse().forEach(A)
			} else {
				if(D[0].event == "start") {
					z.push(D[0].node)
				} else {
					z.pop()
				}
				v(D.splice(0, 1)[0])
			}
		}
		return F + k(C.substr(x))
	}

	function m(y) {
		function v(z) {
			return(z && z.source) || z
		}

		function w(A, z) {
			return RegExp(v(A), "m" + (y.cI ? "i" : "") + (z ? "g" : ""))
		}

		function x(D, C) {
			if(D.compiled) {
				return
			}
			D.compiled = true;
			D.k = D.k || D.bK;
			if(D.k) {
				var z = {};

				function E(G, F) {
					if(y.cI) {
						F = F.toLowerCase()
					}
					F.split(" ").forEach(function(H) {
						var I = H.split("|");
						z[I[0]] = [G, I[1] ? Number(I[1]) : 1]
					})
				}
				if(typeof D.k == "string") {
					E("keyword", D.k)
				} else {
					Object.keys(D.k).forEach(function(F) {
						E(F, D.k[F])
					})
				}
				D.k = z
			}
			D.lR = w(D.l || /\b[A-Za-z0-9_]+\b/, true);
			if(C) {
				if(D.bK) {
					D.b = D.bK.split(" ").join("|")
				}
				if(!D.b) {
					D.b = /\B|\b/
				}
				D.bR = w(D.b);
				if(!D.e && !D.eW) {
					D.e = /\B|\b/
				}
				if(D.e) {
					D.eR = w(D.e)
				}
				D.tE = v(D.e) || "";
				if(D.eW && C.tE) {
					D.tE += (D.e ? "|" : "") + C.tE
				}
			}
			if(D.i) {
				D.iR = w(D.i)
			}
			if(D.r === undefined) {
				D.r = 1
			}
			if(!D.c) {
				D.c = []
			}
			var B = [];
			D.c.forEach(function(F) {
				if(F.v) {
					F.v.forEach(function(G) {
						B.push(o(F, G))
					})
				} else {
					B.push(F == "self" ? D : F)
				}
			});
			D.c = B;
			D.c.forEach(function(F) {
				x(F, D)
			});
			if(D.starts) {
				x(D.starts, C)
			}
			var A = D.c.map(function(F) {
				return F.bK ? "\\.?\\b(" + F.b + ")\\b\\.?" : F.b
			}).concat([D.tE]).concat([D.i]).map(v).filter(Boolean);
			D.t = A.length ? w(A.join("|"), true) : {
				exec: function(F) {
					return null
				}
			};
			D.continuation = {}
		}
		x(y)
	}

	function c(S, L, J, R) {
		function v(U, V) {
			for(var T = 0; T < V.c.length; T++) {
				if(i(V.c[T].bR, U)) {
					return V.c[T]
				}
			}
		}

		function z(U, T) {
			if(i(U.eR, T)) {
				return U
			}
			if(U.eW) {
				return z(U.parent, T)
			}
		}

		function A(T, U) {
			return !J && i(U.iR, T)
		}

		function E(V, T) {
			var U = M.cI ? T[0].toLowerCase() : T[0];
			return V.k.hasOwnProperty(U) && V.k[U]
		}

		function w(Z, X, W, V) {
			var T = V ? "" : b.classPrefix,
				U = '<span class="' + T,
				Y = W ? "" : "</span>";
			U += Z + '">';
			return U + X + Y
		}

		function N() {
			var U = k(C);
			if(!I.k) {
				return U
			}
			var T = "";
			var X = 0;
			I.lR.lastIndex = 0;
			var V = I.lR.exec(U);
			while(V) {
				T += U.substr(X, V.index - X);
				var W = E(I, V);
				if(W) {
					H += W[1];
					T += w(W[0], V[0])
				} else {
					T += V[0]
				}
				X = I.lR.lastIndex;
				V = I.lR.exec(U)
			}
			return T + U.substr(X)
		}

		function F() {
			if(I.sL && !f[I.sL]) {
				return k(C)
			}
			var T = I.sL ? c(I.sL, C, true, I.continuation.top) : g(C);
			if(I.r > 0) {
				H += T.r
			}
			if(I.subLanguageMode == "continuous") {
				I.continuation.top = T.top
			}
			return w(T.language, T.value, false, true)
		}

		function Q() {
			return I.sL !== undefined ? F() : N()
		}

		function P(V, U) {
			var T = V.cN ? w(V.cN, "", true) : "";
			if(V.rB) {
				D += T;
				C = ""
			} else {
				if(V.eB) {
					D += k(U) + T;
					C = ""
				} else {
					D += T;
					C = U
				}
			}
			I = Object.create(V, {
				parent: {
					value: I
				}
			})
		}

		function G(T, X) {
			C += T;
			if(X === undefined) {
				D += Q();
				return 0
			}
			var V = v(X, I);
			if(V) {
				D += Q();
				P(V, X);
				return V.rB ? 0 : X.length
			}
			var W = z(I, X);
			if(W) {
				var U = I;
				if(!(U.rE || U.eE)) {
					C += X
				}
				D += Q();
				do {
					if(I.cN) {
						D += "</span>"
					}
					H += I.r;
					I = I.parent
				} while (I != W.parent);
				if(U.eE) {
					D += k(X)
				}
				C = "";
				if(W.starts) {
					P(W.starts, "")
				}
				return U.rE ? 0 : X.length
			}
			if(A(X, I)) {
				throw new Error('Illegal lexeme "' + X + '" for mode "' + (I.cN || "<unnamed>") + '"')
			}
			C += X;
			return X.length || 1
		}
		var M = j(S);
		if(!M) {
			throw new Error('Unknown language: "' + S + '"')
		}
		m(M);
		var I = R || M;
		var D = "";
		for(var K = I; K != M; K = K.parent) {
			if(K.cN) {
				D = w(K.cN, D, true)
			}
		}
		var C = "";
		var H = 0;
		try {
			var B, y, x = 0;
			while(true) {
				I.t.lastIndex = x;
				B = I.t.exec(L);
				if(!B) {
					break
				}
				y = G(L.substr(x, B.index - x), B[0]);
				x = B.index + y
			}
			G(L.substr(x));
			for(var K = I; K.parent; K = K.parent) {
				if(K.cN) {
					D += "</span>"
				}
			}
			return {
				r: H,
				value: D,
				language: S,
				top: I
			}
		} catch(O) {
			if(O.message.indexOf("Illegal") != -1) {
				return {
					r: 0,
					value: k(L)
				}
			} else {
				throw O
			}
		}
	}

	function g(y, x) {
		x = x || b.languages || Object.keys(f);
		var v = {
			r: 0,
			value: k(y)
		};
		var w = v;
		x.forEach(function(z) {
			if(!j(z)) {
				return
			}
			var A = c(z, y, false);
			A.language = z;
			if(A.r > w.r) {
				w = A
			}
			if(A.r > v.r) {
				w = v;
				v = A
			}
		});
		if(w.language) {
			v.second_best = w
		}
		return v
	}

	function h(v) {
		if(b.tabReplace) {
			v = v.replace(/^((<[^>]+>|\t)+)/gm, function(w, z, y, x) {
				return z.replace(/\t/g, b.tabReplace)
			})
		}
		if(b.useBR) {
			v = v.replace(/\n/g, "<br>")
		}
		return v
	}

	function p(z) {
		var y = d(z);
		var A = r(z);
		if(A == "no-highlight") {
			return
		}
		var v = A ? c(A, y, true) : g(y);
		var w = u(z);
		if(w.length) {
			var x = document.createElementNS("http://www.w3.org/1999/xhtml", "pre");
			x.innerHTML = v.value;
			v.value = q(w, u(x), y)
		}
		v.value = h(v.value);
		z.innerHTML = v.value;
		z.className += " hljs " + (!A && v.language || "");
		z.result = {
			language: v.language,
			re: v.r
		};
		if(v.second_best) {
			z.second_best = {
				language: v.second_best.language,
				re: v.second_best.r
			}
		}
	}
	var b = {
		classPrefix: "hljs-",
		tabReplace: null,
		useBR: false,
		languages: undefined
	};

	function s(v) {
		b = o(b, v)
	}

	function l() {
		if(l.called) {
			return
		}
		l.called = true;
		var v = document.querySelectorAll("pre code");
		Array.prototype.forEach.call(v, p)
	}

	function a() {
		addEventListener("DOMContentLoaded", l, false);
		addEventListener("load", l, false)
	}
	var f = {};
	var n = {};

	function e(v, x) {
		var w = f[v] = x(this);
		if(w.aliases) {
			w.aliases.forEach(function(y) {
				n[y] = v
			})
		}
	}

	function j(v) {
		return f[v] || f[n[v]]
	}
	this.highlight = c;
	this.highlightAuto = g;
	this.fixMarkup = h;
	this.highlightBlock = p;
	this.configure = s;
	this.initHighlighting = l;
	this.initHighlightingOnLoad = a;
	this.registerLanguage = e;
	this.getLanguage = j;
	this.inherit = o;
	this.IR = "[a-zA-Z][a-zA-Z0-9_]*";
	this.UIR = "[a-zA-Z_][a-zA-Z0-9_]*";
	this.NR = "\\b\\d+(\\.\\d+)?";
	this.CNR = "(\\b0[xX][a-fA-F0-9]+|(\\b\\d+(\\.\\d*)?|\\.\\d+)([eE][-+]?\\d+)?)";
	this.BNR = "\\b(0b[01]+)";
	this.RSR = "!|!=|!==|%|%=|&|&&|&=|\\*|\\*=|\\+|\\+=|,|-|-=|/=|/|:|;|<<|<<=|<=|<|===|==|=|>>>=|>>=|>=|>>>|>>|>|\\?|\\[|\\{|\\(|\\^|\\^=|\\||\\|=|\\|\\||~";
	this.BE = {
		b: "\\\\[\\s\\S]",
		r: 0
	};
	this.ASM = {
		cN: "string",
		b: "'",
		e: "'",
		i: "\\n",
		c: [this.BE]
	};
	this.QSM = {
		cN: "string",
		b: '"',
		e: '"',
		i: "\\n",
		c: [this.BE]
	};
	this.CLCM = {
		cN: "comment",
		b: "//",
		e: "$"
	};
	this.CBLCLM = {
		cN: "comment",
		b: "/\\*",
		e: "\\*/"
	};
	this.HCM = {
		cN: "comment",
		b: "#",
		e: "$"
	};
	this.NM = {
		cN: "number",
		b: this.NR,
		r: 0
	};
	this.CNM = {
		cN: "number",
		b: this.CNR,
		r: 0
	};
	this.BNM = {
		cN: "number",
		b: this.BNR,
		r: 0
	};
	this.REGEXP_MODE = {
		cN: "regexp",
		b: /\//,
		e: /\/[gim]*/,
		i: /\n/,
		c: [this.BE, {
			b: /\[/,
			e: /\]/,
			r: 0,
			c: [this.BE]
		}]
	};
	this.TM = {
		cN: "title",
		b: this.IR,
		r: 0
	};
	this.UTM = {
		cN: "title",
		b: this.UIR,
		r: 0
	}
}();
hljs.registerLanguage("bash", function(b) {
	var a = {
		cN: "variable",
		v: [{
			b: /\$[\w\d#@][\w\d_]*/
		}, {
			b: /\$\{(.*?)\}/
		}]
	};
	var d = {
		cN: "string",
		b: /"/,
		e: /"/,
		c: [b.BE, a, {
			cN: "variable",
			b: /\$\(/,
			e: /\)/,
			c: [b.BE]
		}]
	};
	var c = {
		cN: "string",
		b: /'/,
		e: /'/
	};
	return {
		l: /-?[a-z\.]+/,
		k: {
			keyword: "if then else elif fi for break continue while in do done exit return set declare case esac export exec",
			literal: "true false",
			built_in: "printf echo read cd pwd pushd popd dirs let eval unset typeset readonly getopts source shopt caller type hash bind help sudo",
			operator: "-ne -eq -lt -gt -f -d -e -s -l -a"
		},
		c: [{
			cN: "shebang",
			b: /^#![^\n]+sh\s*$/,
			r: 10
		}, {
			cN: "function",
			b: /\w[\w\d_]*\s*\(\s*\)\s*\{/,
			rB: true,
			c: [b.inherit(b.TM, {
				b: /\w[\w\d_]*/
			})],
			r: 0
		}, b.HCM, b.NM, d, c, a]
	}
});
hljs.registerLanguage("javascript", function(a) {
	return {
		aliases: ["js"],
		k: {
			keyword: "in if for while finally var new function do return void else break catch instanceof with throw case default try this switch continue typeof delete let yield const class",
			literal: "true false null undefined NaN Infinity",
			built_in: "eval isFinite isNaN parseFloat parseInt decodeURI decodeURIComponent encodeURI encodeURIComponent escape unescape Object Function Boolean Error EvalError InternalError RangeError ReferenceError StopIteration SyntaxError TypeError URIError Number Math Date String RegExp Array Float32Array Float64Array Int16Array Int32Array Int8Array Uint16Array Uint32Array Uint8Array Uint8ClampedArray ArrayBuffer DataView JSON Intl arguments require"
		},
		c: [{
			cN: "pi",
			b: /^\s*('|")use strict('|")/,
			r: 10
		}, a.ASM, a.QSM, a.CLCM, a.CBLCLM, a.CNM, {
			b: "(" + a.RSR + "|\\b(case|return|throw)\\b)\\s*",
			k: "return throw case",
			c: [a.CLCM, a.CBLCLM, a.REGEXP_MODE, {
				b: /</,
				e: />;/,
				r: 0,
				sL: "xml"
			}],
			r: 0
		}, {
			cN: "function",
			bK: "function",
			e: /\{/,
			c: [a.inherit(a.TM, {
				b: /[A-Za-z$_][0-9A-Za-z$_]*/
			}), {
				cN: "params",
				b: /\(/,
				e: /\)/,
				c: [a.CLCM, a.CBLCLM],
				i: /["'\(]/
			}],
			i: /\[|%/
		}, {
			b: /\$[(.]/
		}, {
			b: "\\." + a.IR,
			r: 0
		}]
	}
});
hljs.registerLanguage("xml", function(a) {
	var c = "[A-Za-z0-9\\._:-]+";
	var d = {
		b: /<\?(php)?(?!\w)/,
		e: /\?>/,
		sL: "php",
		subLanguageMode: "continuous"
	};
	var b = {
		eW: true,
		i: /</,
		r: 0,
		c: [d, {
			cN: "attribute",
			b: c,
			r: 0
		}, {
			b: "=",
			r: 0,
			c: [{
				cN: "value",
				v: [{
					b: /"/,
					e: /"/
				}, {
					b: /'/,
					e: /'/
				}, {
					b: /[^\s\/>]+/
				}]
			}]
		}]
	};
	return {
		aliases: ["html"],
		cI: true,
		c: [{
			cN: "doctype",
			b: "<!DOCTYPE",
			e: ">",
			r: 10,
			c: [{
				b: "\\[",
				e: "\\]"
			}]
		}, {
			cN: "comment",
			b: "<!--",
			e: "-->",
			r: 10
		}, {
			cN: "cdata",
			b: "<\\!\\[CDATA\\[",
			e: "\\]\\]>",
			r: 10
		}, {
			cN: "tag",
			b: "<style(?=\\s|>|$)",
			e: ">",
			k: {
				title: "style"
			},
			c: [b],
			starts: {
				e: "</style>",
				rE: true,
				sL: "css"
			}
		}, {
			cN: "tag",
			b: "<script(?=\\s|>|$)",
			e: ">",
			k: {
				title: "script"
			},
			c: [b],
			starts: {
				e: "<\/script>",
				rE: true,
				sL: "javascript"
			}
		}, {
			b: "<%",
			e: "%>",
			sL: "vbscript"
		}, d, {
			cN: "pi",
			b: /<\?\w+/,
			e: /\?>/,
			r: 10
		}, {
			cN: "tag",
			b: "</?",
			e: "/?>",
			c: [{
				cN: "title",
				b: "[^ /><]+",
				r: 0
			}, b]
		}]
	}
});
var $ = window.jQuery

var $window = $(window)
var sectionTop = $('.top').outerHeight() + 20
var $createDestroy = $('#switch-create-destroy')

function capitalize(string) {
	return string.charAt(0).toUpperCase() + string.slice(1)
}

window.hljs.initHighlightingOnLoad()
$(function() {
	$('a[href*=\'#\']').on('click', function(event) {
		event.preventDefault()
		var $target = $($(this).attr('href').slice('#'))
		if($target.length) {
			$window.scrollTop($target.offset().top - sectionTop)
		}
	})
	$('input[type="checkbox"], input[type="radio"]')
		.not('[data-switch-no-init]')
		.bootstrapSwitch()

	$('[data-switch-get]').on('click', function() {
		var type = $(this).data('switch-get')
		window.alert($('#switch-' + type).bootstrapSwitch(type))
	})
	$('[data-switch-set]').on('click', function() {
		var type
		type = $(this).data('switch-set')
		$('#switch-' + type).bootstrapSwitch(type, $(this).data('switch-value'))
	})
	$('[data-switch-toggle]').on('click', function() {
		var type = $(this).data('switch-toggle')
		$('#switch-' + type).bootstrapSwitch('toggle' + capitalize(type))
	})
	$('[data-switch-set-value]').on('input', function(event) {
		var type, value
		event.preventDefault()
		type = $(this).data('switch-set-value')
		value = $.trim($(this).val())
		if($(this).data('value') === value) {
			return
		}
		$('#switch-' + type).bootstrapSwitch(type, value)
	})
	$('[data-switch-create-destroy]').on('click', function() {
		var isSwitch
		isSwitch = $createDestroy.data('bootstrap-switch')
		$createDestroy.bootstrapSwitch((isSwitch ? 'destroy' : null))
		$(this).button((isSwitch ? 'reset' : 'destroy'))
	})
	$('#confirm').bootstrapSwitch({
		size: 'large',
		onSwitchChange: function(event, state) {
			event.preventDefault()
			return console.log(state, event.isDefaultPrevented())
		}
	})
})