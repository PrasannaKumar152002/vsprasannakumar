package edu.disease.asn2;

import java.util.Arrays;
import java.util.UUID;

import edu.disease.asn1.Exposure;

/**
 * 
 * @author DELL
 *
 */
public class Patient implements Comparable<Patient> {
	private UUID patientId;
	private String firstname;
	private String lastname;
	private Exposure[] exposures;
	private UUID[] diseaseIds;
	int md, me;
	int i = 0, j = 0;

	/**
	 * Constructs a Patient object with specified maximum limits for diseases and
	 * exposures.
	 *
	 * @param maxDiseases  The maximum number of diseases the patient can have.
	 * @param maxExposures The maximum number of exposures the patient can have.
	 * @throws IllegalArgumentException If either maxDiseases or maxExposures is not
	 *                                  a positive integer.
	 */
	public Patient(int maxDiseases, int maxExposures) {
		try {
			if (maxDiseases <= 0 || maxExposures <= 0) {
				throw new IllegalArgumentException("Invalid Data");
			} else {
				md = maxDiseases;
				me = maxExposures;
				diseaseIds = new UUID[maxDiseases];
				exposures = new Exposure[maxExposures];
			}
		} catch (IllegalArgumentException e) {

		}
	}

	/**
	 * Adds a disease identifier to the patient's list of diseases.
	 *
	 * @param id The unique identifier of the disease to add.
	 * @throws IndexOutOfBoundsException If the limit of diseases has been reached.
	 */
	public void addDiseaseId(UUID id) {
		try {
			if (i >= md) {
				throw new IndexOutOfBoundsException("Array Range Exceeds");
			} else {
				diseaseIds[i++] = id;
			}
		} catch (IndexOutOfBoundsException I) {

		}
	}

	/**
	 * Adds an exposure event to the patient's record.
	 *
	 * @param ex The Exposure object representing the exposure event to add.
	 * @throws IndexOutOfBoundsException If the limit of exposures has been reached.
	 */
	public void addExposure(Exposure ex) {
		try {
			if (j >= me) {
				throw new IndexOutOfBoundsException("Array Range Exceeds");
			} else {
				exposures[j++] = ex;
			}
		} catch (IndexOutOfBoundsException I) {

		}
	}

	/**
	 * Retrieves the unique identifier of the patient.
	 *
	 * @return The UUID representing the patient's identifier.
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * Sets the unique identifier of the patient.
	 *
	 * @param patientId The UUID representing the patient's identifier to set.
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * Retrieves the first name of the patient.
	 *
	 * @return The first name of the patient as a String.
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Sets the first name of the patient.
	 *
	 * @param firstname The first name of the patient as a String.
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * Retrieves the last name of the patient.
	 *
	 * @return The last name of the patient as a String.
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Sets the last name of the patient.
	 *
	 * @param lastname The last name of the patient as a String.
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * Generates a hash code for the patient based on their unique identifier.
	 *
	 * @return The hash code as an integer.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	/**
	 * Checks if this patient is equal to another patient based on their unique
	 * identifier.
	 *
	 * @param obj The object to compare to.
	 * @return True if the patients have the same unique identifier, false
	 *         otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Patient other = (Patient) obj;
		if (patientId == null) {
			if (other.patientId != null) {
				return false;
			}
		} else if (!patientId.equals(other.patientId)) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this patient to another patient for sorting purposes based on last
	 * name and then first name.
	 *
	 * @param o The other patient to compare to.
	 * @return A negative integer if this patient should come before the other, a
	 *         positive integer if after, and zero if they are equal in sorting
	 *         order.
	 */
	@Override
	public int compareTo(Patient o) {
		if (this.lastname.toLowerCase().compareTo(o.lastname.toLowerCase()) == 0) {
			return this.firstname.toLowerCase().compareTo(o.firstname.toLowerCase());
		}
		return this.lastname.toLowerCase().compareTo(o.lastname.toLowerCase());
	}

	/**
	 * Generates a string representation of the patient, including their unique
	 * identifier, first name, last name, exposures, and disease identifiers.
	 *
	 * @return A string representation of the patient's attributes.
	 */
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", exposures=" + Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + "]";
	}
}
