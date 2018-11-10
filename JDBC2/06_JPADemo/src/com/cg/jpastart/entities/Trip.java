package com.cg.jpastart.entities;

import javax.annotation.Generated;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trip_Id;
	private String fromCity;
	private String toCity;
	@Embedded
	private SeatInfo info;
	
	public int getTrip_Id() {
		return trip_Id;
	}
	public void setTrip_Id(int trip_Id) {
		this.trip_Id = trip_Id;
	}
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public SeatInfo getInfo() {
		return info;
	}
	public void setInfo(SeatInfo info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Trip [trip_Id=" + trip_Id + ", fromCity=" + fromCity
				+ ", toCity=" + toCity + ", info=" + info + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + trip_Id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trip other = (Trip) obj;
		if (trip_Id != other.trip_Id)
			return false;
		return true;
	}
	
}
