$(document).ready(function() {
	var a = ['吴', '曾', '唐', '熊'];
	var b = ['母子', '外亲', '父子', '夫妻'];
	var c = ['土豪1', '土豪2', '土豪3', '土豪4'];
	var d = ['12', '23', '34', '45'];
	var val;
	for(var i = 0; i < 4; i++) {
		
		val += "<tr id='tr"+i+"'>"
		        +"<td>姓名：<input type='text' name='name1' value='"+a[i]+"'/></td>"
		        +"<td>关系：<input type='text' name='relations' value='"+b[i]+"'/></td>"
		        +"<td>工作状况 : <input type='text' name='workcondition' value='"+c[i]+"'/></td>"
		        +"<td>联系电话：<input type='text' name='phone1' value='"+d[i]+"'/></td>"
		        +"<td onClick='del_contact(this)'><button class='contact_del_btn' type='button' title='删除'/></td>"
		    +"</tr>";
	}
	$(".contact_table").html(val);
});

//添加紧急联系人
function add_contact() {
    var table = document.getElementById("contact_table");
    var rows = table.rows.length;
    var add_tr = "<tr id='tr"+rows+"'>"
                    +"<td>姓名：<input type='text' name='name1'/></td>"
                    +"<td>关系：<input type='text' name='relations'/></td>"
                    +"<td>工作状况 : <input type='text' name='workcondition'/></td>"
                    +"<td>联系电话：<input type='text' name='phone1'/></td>"
		            +"<td  onClick='del_contact(this)'><button class='contact_del_btn' type='button' title='删除'/></td>"
                +" </tr>"
	$(".contact_table").append(add_tr);
};

//删除紧急联系人
function del_contact(v){
	$(v).parent().remove();  
}
