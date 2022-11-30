package agam_Day44.CarTask;

public interface AutoPilot extends AutoPark {
    boolean hasAutoPilot=false;
    void selfDrive();
}
/*
* 3. Create a child interface of AutoPark named AutoPilot
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();
* */