package org.service;

import org.model.Certificate;

public interface CertificateService {
	/**
	 * 1添加证书
	 * @param a
	 * @return
	 */
	public Object addCertificate(Certificate a);
	
	/**
	 * 2删除证书
	 * @param id
	 * @return
	 */
	public Object deleteCertificate(long id);
	
	/**
	 * 3修改证书
	 * @param a
	 * @return
	 */
	public Object updateCertificate(Certificate a);
	
	/**
	 * 4获取证书列表
	 * @return
	 */
	public Object getCertificateList();
}
