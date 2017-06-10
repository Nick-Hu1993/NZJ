package org.dao;

import java.util.List;

import org.model.Cooking;

public interface CookingDao {
	//-----------------------------------增---------------------------------------
		/**
		 * 1.1添加烹饪能力
		 * @param l
		 * @return
		 */
		public long addCooking(Cooking l);
		//-----------------------------------删---------------------------------------
		/**
		 * 2.1删除烹饪能力
		 * @param id
		 * @return
		 */
		public boolean deleteCooking(long id);
		//-----------------------------------改---------------------------------------
		/**
		 * 3.1修改烹饪能力
		 * @param l
		 * @return
		 */
		public boolean updateCooking(Cooking l);
		/**
		 * 3.2修改阿姨的烹饪技能
		 * @param AuntId
		 * @param coId
		 * @return
		 */
		public boolean updateCookingByAuntId(long AuntId,long[] coId);
		//-----------------------------------查---------------------------------------
		/**
		 * 4.1查询烹饪能力
		 * @return
		 */
		public List getCookingList();
		/**
		 * 4.2通过阿姨的id查出会的所有的烹饪能力
		 * @param auntId
		 * @return
		 */
		public List getCookingByAuntId(long auntId);
}
