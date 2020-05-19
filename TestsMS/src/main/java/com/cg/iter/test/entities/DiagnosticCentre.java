package com.cg.iter.test.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;



//import com.cg.iter.test.entities.Test;


@Entity
@Table(name = "diagnostic_centres")
public class DiagnosticCentre {
	@Id
//	@GeneratedValue(generator = "system-uuid")
//	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	
	@Column(name = "CentreId")
	private String centreId;
	
	@Column(name = "CentreName")
	private String centreName;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "test_c_id")
	private List<Test> listOfTests = new ArrayList<>();
	
	public DiagnosticCentre() {
	}
	
	
	public DiagnosticCentre(String centreId, String centreName) {
		super();
		this.centreId = centreId;
		this.centreName = centreName;
	}

	public DiagnosticCentre(String centreName) {
		this.centreName = centreName;
	}

	public String getCentreId() {
		return centreId;
	}

	public void setCentreId(String centreId) {
		this.centreId = centreId;
	}

	public String getCentreName() {
		return centreName;
	}

	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}

}