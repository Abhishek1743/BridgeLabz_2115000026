class VolumeOfEarth{
	public static void main(String args[]){
	double radiusInKm= 6378, radiusInMiles = radiusInKm/1.6;
	double pi=3.14;
	double volumeOfSphereInKm = (4.0/3.0)*pi*(radiusInKm*radiusInKm*radiusInKm);
	double volumeOfSphereInMiles = (4.0/3.0)*pi*(radiusInMiles*radiusInMiles*radiusInMiles);
	System.out.println("The volume of earth in cubic kilometers is " +volumeOfSphereInKm + " and cubic miles is " +volumeOfSphereInMiles);
	}
}
