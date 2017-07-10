package org.test;
import java.text.ParseException;

import org.dao.ShareAuntDao;
import org.dao.imp.ShareAuntDaoImp;
import org.tool.ChangeTime;

/**
*
* @author hp
*/
public class test21 {

    public static void main(String args[]) throws ParseException {
       boolean b= ChangeTime.compare_date("2017-07-05", "2017-07-06");
       System.out.println("2017-07-05 大于 2017-07-06 ?"+ b);
       ShareAuntDao saDao = new ShareAuntDaoImp();
       System.out.println(saDao.getCountByTime("2017-05-11", "2017-07-06", 1));
    }
}