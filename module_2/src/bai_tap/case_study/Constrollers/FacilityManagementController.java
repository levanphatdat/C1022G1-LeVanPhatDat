package bai_tap.case_study.Constrollers;

import bai_tap.case_study.Models.Facility.Room;
import bai_tap.case_study.Models.Facility.Villa;
import bai_tap.case_study.Services.FacilityService.FacilityService;
import bai_tap.case_study.Services.FacilityService.IFacilityService;
import bai_tap.case_study.Ultis.RegexCode;


import java.util.Scanner;

public class FacilityManagementController {
    public void facilityManagement() {
        IFacilityService iFacilityService = new FacilityService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---- Facility Management ----\n" +
                    "1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n" +
                    "-----------------------------\n" +
                    "Enter your choice : ");
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.err.println("Enter choice again ");
            }
            switch (choice) {
                case 1:
                    iFacilityService.display();
                    break;
                case 2:
                    do {
                        System.out.println("1.\tAdd New Villa\n" +
                                "2.\tAdd New Room\n" +
                                "3.\tBack to menu\n" +
                                "--------------------------\n" +
                                "Enter your choice : ");
                        int choice1 = -1;
                        try {
                            choice1 = Integer.parseInt(scanner.nextLine());

                        } catch (NumberFormatException e) {
                            System.err.println("Enter choice again ");
                        }
                        switch (choice1) {
                            case 1:
                                System.out.println("Add New Villa : ");
                                String addServiceCode;
                                do {
                                    System.out.println("Enter the service code : ");
                                    addServiceCode = scanner.nextLine();
                                } while (!RegexCode.checkVilla(addServiceCode));

                                if (iFacilityService.checkServiceCodeVilla(addServiceCode)) {
                                    System.out.println("Enter the service name : ");
                                    String addServiceName = scanner.nextLine();

                                    String addUsableArea;
                                    do {
                                        System.out.println("Enter the usable area : ");
                                        addUsableArea = scanner.nextLine();
                                    } while (!RegexCode.checkArea(addUsableArea));


                                    String addRentalCost;
                                    do {
                                        System.out.println("Enter the rental cost : ");
                                        addRentalCost = scanner.nextLine();
                                    } while (!RegexCode.checkRentalCost(addRentalCost));

                                    String addPeople;
                                    do {
                                        System.out.println("Enter the max people : ");
                                        addPeople = scanner.nextLine();
                                    } while (!RegexCode.checkMaxPeople(addPeople));

                                    System.out.println("Enter the rental type : ");
                                    String addRentalType = scanner.nextLine();

                                    System.out.println("Enter the room standard : ");
                                    String addRoomStandard = scanner.nextLine();

                                    String addPoolArea;
                                    do {
                                        System.out.println("Enter the pool area : ");
                                        addPoolArea = scanner.nextLine();
                                    } while (!RegexCode.checkArea(addPoolArea));

                                    String addFloors;
                                    do {
                                        System.out.println("Enter the floors : ");
                                        addFloors = scanner.nextLine();
                                    } while (!RegexCode.checkFloors(addFloors));

                                    System.out.println("Enter the number of uses : ");
                                    int addUses = Integer.parseInt(scanner.nextLine());
                                    Villa villa = new Villa(addServiceCode, addServiceName, addUsableArea, addRentalCost, addPeople, addRentalType, addRoomStandard, addPoolArea, addFloors);
                                    iFacilityService.addVilla(villa, addUses);
                                } else {
                                    System.out.println("ID is duplicated !!!");
                                }
                                break;
                            case 2:
                                System.out.println("Add New Room : ");
                                String addServiceCodeR;
                                do {
                                    System.out.println("Enter the service code : ");
                                    addServiceCodeR = scanner.nextLine();
                                } while (!RegexCode.checkRoom(addServiceCodeR));

                                if (iFacilityService.checkServiceCodeRoom(addServiceCodeR)) {
                                    System.out.println("Enter the service name : ");
                                    String addServiceName = scanner.nextLine();

                                    String addUsableArea;
                                    do {
                                        System.out.println("Enter the usable area : ");
                                        addUsableArea = scanner.nextLine();
                                    } while (!RegexCode.checkArea(addUsableArea));


                                    String addRentalCost;
                                    do {
                                        System.out.println("Enter the rental cost : ");
                                        addRentalCost = scanner.nextLine();
                                    } while (!RegexCode.checkRentalCost(addRentalCost));

                                    String addPeople;
                                    do {
                                        System.out.println("Enter the max people : ");
                                        addPeople = scanner.nextLine();
                                    } while (!RegexCode.checkMaxPeople(addPeople));

                                    System.out.println("Enter the rental type : ");
                                    String addRentalType = scanner.nextLine();

                                    System.out.println("Enter the free service : ");
                                    String addFreeService = scanner.nextLine();

                                    System.out.println("Enter the number of uses : ");
                                    int addUses = Integer.parseInt(scanner.nextLine());
                                    Room room = new Room(addServiceCodeR, addServiceName, addUsableArea, addRentalCost, addPeople, addRentalType, addFreeService);
                                    iFacilityService.addRoom(room, addUses);
                                } else {
                                    System.out.println("ID is duplicated !!!");
                                }
                                break;
                            case 3:
                                facilityManagement();
                                break;
                            default:
                                System.out.println("You choose wrong. Please choose again");
                        }
                    } while (true);
                case 3:
                    iFacilityService.displayMaintenance();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("You choose wrong. Please choose again");
            }
        } while (true);
    }
}
