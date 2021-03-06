package de.linkinglod.db;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Hibernate object Algorithm.
 * @author Markus Nentwig <nentwig@informatik.uni-leipzig.de>
 *
 */
@Entity
@Table(name="Algorithm")
public class Algorithm implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAlgorithm", unique = true, nullable = false)
	private int idAlgorithm;
	@Column(name = "idFramework", nullable = false)
	private int idFramework;
	@Column(name = "hashMapping", nullable = false)
	private String hashMapping;
	@Column(name = "url", nullable = false)
	private String url;
	private String parameters;
    private Timestamp creationDate;

	/**
	 * New Algorithm hibernate object, uri needs to be configured.
	 */
	public Algorithm() {
	}
	
	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public int getIdAlgorithm() {
		return idAlgorithm;
	}

	public void setIdAlgorithm(int idAlgorithm) {
		this.idAlgorithm = idAlgorithm;
	}
	
	public int getIdFramework() {
		return idFramework;
	}
	
	public void setIdFramework(int idFramework) {
		this.idFramework = idFramework;
	}
	
	public String getHashMapping() {
		return hashMapping;
	}
	
	public void setHashMapping(String hashMapping) {
		this.hashMapping = hashMapping;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
	
}
