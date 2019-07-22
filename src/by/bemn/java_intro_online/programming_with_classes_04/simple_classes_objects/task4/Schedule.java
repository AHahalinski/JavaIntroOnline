package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task4;

public class Schedule {
    private Train[] trains;

    public Schedule(Train[] trains) {
        this.trains = trains;
    }

    public Train[] getTrains() {
        return trains;
    }

    public void setTrains(Train[] trains) {
        this.trains = trains;
    }

    public void getInformationTrain(int numberTrain) {
        for(Train train : trains) {
            if(train.getNumberTrain() == numberTrain) {
                System.out.println(train);
            }
        }
    }

    public void sortingTrain() {
        for (int i = 0; i < trains.length-1;) {
            if(trains[i].getDestination().compareTo(trains[i+1].getDestination())>0){
                Train temp = trains[i];
                trains[i] = trains[i+1];
                trains[i+1] = temp;
                if(i>0) {
                    i--;
                }
            } else if(trains[i].getDestination().compareTo(trains[i+1].getDestination())==0) {
                if(trains[i].getTimeDeparture().compareTo(trains[i+1].getTimeDeparture())>0){
                    Train temp = trains[i];
                    trains[i] = trains[i+1];
                    trains[i+1] = temp;
                    if(i>0) {
                        i=i-2;
                    }
                }
                i++;
            } else i++;
        }
    }

    public void print() {
        for (Train train : trains) {
            train.getInformation();
        }
    }
}
