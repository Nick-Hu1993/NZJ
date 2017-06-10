package org.dao;

import java.util.List;

import org.model.Certificate;

public interface CertificateDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1添加证件
	 * @param l
	 * @return
	 */
	public long addCertificate(Certificate l);
	//-----------------------------------删---------------------------------------
	/**
	 * 2.1删除证件
	 * @param id
	 * @return
	 */
	public boolean deleteCertificate(long id);
	//-----------------------------------改---------------------------------------
	/**
	 * 3.1修改证件
	 * @param l
	 * @return
	 */
	public boolean updateCertificate(Certificate l);
	/**
	 * 3.2修改阿姨的证件
	 * @param AuntId
	 * @param ceId
	 * @return
	 */
	public boolean updateCertificateByAuntId(long AuntId,long[] ceId);
	//-----------------------------------查---------------------------------------
	/**
	 * 4.1查询证件
	 * @return
	 */
	public List getCertificateList();
	/**
	 * 4.2通过阿姨的id查出会的所有的证书
	 * @param auntId
	 * @return
	 */
	public List getCertificateByAuntId(long auntId);
}
