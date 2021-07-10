import java.io.*;
import java.util.*;
import java.util.Calendar;


class staff
{
    String sid, sname, desg, gender;
    int salary;
    void new_staff()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        sid = input.nextLine();

        System.out.print("name:-");
        sname = input.nextLine();

        System.out.print("desigination:-");
        desg = input.nextLine();

        System.out.print("gender:-");
        gender = input.nextLine();

        System.out.print("salary:-");
        salary = input.nextInt();
    }

    void staff_info()

    {
        System.out.println(sid + "\t" + sname + "\t" + gender + "\t" + salary);
    }

}

class doctor

{
    String did, dname, specilist, appoint, doc_qual;
    int droom;
    void new_doctor()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        did = input.nextLine();

        System.out.print("name:-");
        dname = input.nextLine();

        System.out.print("specilization:-");
        specilist = input.nextLine();

        System.out.print("work time:-");
        appoint = input.nextLine();

        System.out.print("qualification:-");
        doc_qual = input.nextLine();

        System.out.print("room no.:-");
        droom = input.nextInt();

    }

    void doctor_info()

    {
        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);

    }
}

class patient

{
    String pid, pname, covidLevel, gender, admit_status;
    int age;
    void new_patient()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        pid = input.nextLine();

        System.out.print("name:-");
        pname = input.nextLine();

        System.out.print("Covid Level:-");
        covidLevel = input.nextLine();

        System.out.print("gender:-");
        gender = input.nextLine();

        System.out.print("admit_status:-");
        admit_status = input.nextLine();

        System.out.print("age:-");
        age = input.nextInt();

    }

    void patient_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + covidLevel + "     \t" + gender + "      \t" + admit_status + "\t" + age);
    }
}

class vaccine

{
    String vac_name, vac_comp, exp_date;
    int vac_cost, count;
    void new_medi()
    {

        Scanner input = new Scanner(System.in);

        System.out.print("name:-");
        vac_name = input.nextLine();

        System.out.print("comp:-");
        vac_comp = input.nextLine();

        System.out.print("exp_date:-");
        exp_date = input.nextLine();

        System.out.print("cost:-");
        vac_cost = input.nextInt();

        System.out.print("no of unit:-");
        count = input.nextInt();

    }

    void find_medi()
    {
        System.out.println(vac_name + "  \t" + vac_comp + "    \t" + exp_date + "     \t" + vac_cost);
    }
}

class lab

{
    String fecility;
    int lab_cost;
    void new_feci()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Test Kit Name:-");
        fecility = input.nextLine();

        System.out.print("cost:-");
        lab_cost = input.nextInt();

    }

    void feci_list()
    {
        System.out.println(fecility + "\t\t" + lab_cost);

    }
}

class fecility //Sorry Facility but do not change the name 

{
    String fec_name;
    void add_feci()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("Test Kit Name:-");
        fec_name = input.nextLine();
    }

    void show_feci()
    {
        System.out.println(fec_name);
    }
}

public class QurantineManagement

{
    public static void main(String args[])
    {
        String months[] = {

            "Jan",
            "Feb",
            "Mar",
            "Apr",

            "May",
            "Jun",
            "Jul",
            "Aug",

            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };

        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Qurantine Management System ***");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        doctor[] d = new doctor[25];

        patient[] p = new patient[100];

        lab[] l = new lab[20];

        fecility[] f = new fecility[20];

        vaccine[] m = new vaccine[100];

        staff[] s = new staff[100];

        int i;

        for (i = 0; i < 25; i++)

            d[i] = new doctor();

        for (i = 0; i < 100; i++)

            p[i] = new patient();

        for (i = 0; i < 20; i++)

            l[i] = new lab();

        for (i = 0; i < 20; i++)

            f[i] = new fecility();

        for (i = 0; i < 100; i++)

            m[i] = new vaccine();

        for (i = 0; i < 100; i++)

            s[i] = new staff();


        d[0].did = "21";
        d[0].dname = "Dr.Amir";
        d[0].specilist = "ENT";
        d[0].appoint = "5-11AM";
        d[0].doc_qual = "Master";
        d[0].droom = 17;

        d[1].did = "32";
        d[1].dname = "Dr.Rogayah";
        d[1].specilist = "Physician";
        d[1].appoint = "10-3AM";
        d[1].doc_qual = "Master";
        d[1].droom = 45;

        d[2].did = "17";
        d[2].dname = "Dr.Azman";
        d[2].specilist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = "Master";
        d[2].droom = 8;

        d[3].did = "33";
        d[3].dname = "Dr.Aisyah";
        d[3].specilist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].doc_qual = "Degree";
        d[3].droom = 40;


        p[0].pid = "12";
        p[0].pname = "Rahim";
        p[0].covidLevel = "High";
        p[0].gender = "Male";
        p[0].admit_status = "y";
        p[0].age = 30;

        p[1].pid = "13";
        p[1].pname = "Amalina";
        p[1].covidLevel = "Medium";
        p[1].gender = "Female";
        p[1].admit_status = "y";
        p[1].age = 23;

        p[2].pid = "14";
        p[2].pname = "putri";
        p[2].covidLevel = "Low";
        p[2].gender = "Female";
        p[2].admit_status = "y";
        p[2].age = 45;

        p[3].pid = "15";
        p[3].pname = "Shahrin";
        p[3].covidLevel = "High";
        p[3].gender = "Male";
        p[3].admit_status = "y";
        p[3].age = 25;


        m[0].vac_name = "Pfizer";
        m[0].vac_comp = "Bio-Pfizer";
        m[0].exp_date = "28-10-21";
        m[0].vac_cost = 13;
        m[0].count = 8;

        m[1].vac_name = "Ocf-Astra";
        m[1].vac_comp = "Astrazeneca";
        m[1].exp_date = "3-12-21";
        m[1].vac_cost = 50;
        m[1].count = 50000;

        m[2].vac_name = "Moderna";
        m[2].vac_comp = "Moderna Inc";
        m[2].exp_date = "20-8-21";
        m[2].vac_cost = 80;
        m[2].count = 1000;

        m[3].vac_name = "Sinovac";
        m[3].vac_comp = "sino chi";
        m[3].exp_date = "12-9-21";
        m[3].vac_cost = 150;
        m[3].count = 100000;


        l[0].fecility = "NowCheck     ";
        l[0].lab_cost = 800;

        l[1].fecility = "Antigen Rapid Test   ";
        l[1].lab_cost = 1200;

        l[2].fecility = "SARS-CoV-2 Rapid Antigen   ";
        l[2].lab_cost = 500;

        l[3].fecility = "UNICELL-2019-nCoV ";
        l[3].lab_cost = 50;


        f[0].fec_name = "Ambulance";

        f[1].fec_name = "Oxygen Tank ";

        f[2].fec_name = "Bed";

        f[3].fec_name = "ICU";


        s[0].sid = "22";
        s[0].sname = "Aina";
        s[0].desg = "Volunteer";
        s[0].gender = "Male";
        s[0].salary = 5000;

        s[1].sid = "23";
        s[1].sname = "Najihah";
        s[1].desg = "Nurse";
        s[1].gender = "Female";
        s[1].salary = 2000;

        s[2].sid = "24";
        s[2].sname = "Ikmal";
        s[2].desg = "Volunteer";
        s[2].gender = "Male";
        s[2].salary = 5000;

        s[3].sid = "25";
        s[3].sname = "Iman";
        s[3].desg = "Nurse";
        s[3].gender = "Female";
        s[3].salary = 20000;


        Scanner input = new Scanner(System.in);

        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;

        while (status == 1)

        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctos  2. Patients  3.Vaccine  4.Covid Test Kit  5. Facilities  6. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");

            choice = input.nextInt();
            switch (choice)

            {

                case 1:

                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        s1 = 1;

                        while (s1 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1)

                            {
                                case 1:
                                    {
                                        d[count1].new_doctor();count1++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].doctor_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }

                case 2:

                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **PATIENT SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        s2 = 1;

                        while (s2 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        p[count2].new_patient();count2++;
                                        break;
                                    }

                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Covid Level \t Gender \t Admit Status \t Age");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++) {
                                            p[j].patient_info();
                                        }
                                        break;
                                    }
                            }

                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        break;
                    }

                case 3:
                    {
                        s3 = 1;

                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **VACCINE SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        while (s3 == 1)
                        {
                            System.out.println("1.Add New Entry\n2. Existing vaccine List");
                            c1 = input.nextInt();

                            switch (c1)
                            {

                                case 1:
                                    {
                                        m[count3].new_medi();count3++;
                                        break;
                                    }

                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Name \t Company \t Expiry Date \t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count3; j++) {
                                            m[j].find_medi();
                                        }
                                        break;
                                    }

                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                        break;
                    }

                case 4:

                    {
                        s4 = 1;

                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                    **COVID TEST SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        while (s4 == 1)

                        {
                            System.out.println("1.Add New Entry \n2.Existing Test Kit List");
                            c1 = input.nextInt();

                            switch (c1)

                            {
                                case 1:
                                    {
                                        l[count4].new_feci();count4++;
                                        break;
                                    }

                                case 2:

                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Test Kit\t\t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count4; j++) {
                                            l[j].feci_list();
                                        }
                                        break;
                                    }
                            }

                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s4 = input.nextInt();
                        }
                        break;
                    }

                case 5:

                    {
                        s5 = 1;

                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("          **QURANTINE FACILITY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        while (s5 == 1)

                        {
                            System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                            c1 = input.nextInt();

                            switch (c1)

                            {
                                case 1:
                                    {
                                        f[count5].add_feci();count5++;
                                        break;
                                    }

                                case 2:
                                    {

                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Quarantine  Facility are:");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count5; j++) {
                                            f[j].show_feci();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s5 = input.nextInt();
                        }
                        break;
                    }

                case 6:

                    {
                        s6 = 1;

                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                       **STAFF SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        while (s6 == 1)

                        {
                            String a = "nurse", b = "worker", c = "Volunteer";
                            System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Volunteer List \n4.Existing Security List");
                            c1 = input.nextInt();

                            switch (c1)

                            {
                                case 1:
                                    {
                                        s[count6].new_staff();count6++;
                                        break;
                                    }

                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count6; j++)
                                        {
                                            if (a.equals(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }

                                case 3:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count6; j++)
                                        {
                                            if (b.equals(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                case 4:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count6; j++)
                                        {
                                            if (c.equals(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s6 = input.nextInt();
                        }
                        break;
                    }
                default:
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
            }

            System.out.println("\nReturn to MAIN MENU Press 1");

            status = input.nextInt();
        }
    }
}