package com.mycompany.atividadesacocheio.FakeDB;

import com.mycompany.atividadesacocheio.RawData.*;

import com.mycompany.atividadesacocheio.pojo.FuncionarioPojo;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.*;

public final class EmpresaFakeDB {

    private static ArrayList<FuncionarioPojo> funcionarios;

    private static ArrayList<FuncionarioDadosEmpresa> funcionariosDadosEmpresa;

    private static ArrayList<FuncionarioDadosPessoais> funcionariosDadosPessoais;

    private static SimpleDateFormat formato;

    public static ArrayList<FuncionarioDadosPessoais> getFuncionarioDadosPessoais() {
        if (funcionariosDadosPessoais == null) {
            inicializarFuncionarioDadosPessoais();
        }
        return funcionariosDadosPessoais;
    }

    public static ArrayList<FuncionarioDadosEmpresa> getFuncionarioDadosEmpresa() {
        if (funcionariosDadosEmpresa == null) {
            inicializarFuncionarioDadosEmpresa();
        }
        return funcionariosDadosEmpresa;
    }

    public static ArrayList<FuncionarioPojo> getFuncionarios() {
        if (funcionarios == null) {
            inicializaodeFuncionarios();

        }
        return funcionarios;
    }

    private static void inicializarFuncionarioDadosEmpresa() {
        funcionariosDadosEmpresa = new ArrayList();
        formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            adicionarFuncionarioDadosEmpresa(20100150001L, "Georgi", "Facello", formato.parse("1986-06-26"), "49001540741/380", 49001540741L, 380);
            adicionarFuncionarioDadosEmpresa(20100150002L, "Bezalel", "Simmel", formato.parse("1985-11-21"), "38050201548/584", 38050201548L, 584);
            adicionarFuncionarioDadosEmpresa(20100150003L, "Parto", "Bamford", formato.parse("1986-08-28"), "45152038868/403", 45152038868L, 403);
            adicionarFuncionarioDadosEmpresa(20100150004L, "Chirstian", "Koblick", formato.parse("1986-12-01"), "93993062385/891", 93993062385L, 891);
            adicionarFuncionarioDadosEmpresa(20100150005L, "Kyoichi", "Maliniak", formato.parse("1989-09-12"), "64885131268/229", 64885131268L, 229);
            adicionarFuncionarioDadosEmpresa(20100150006L, "Anneke", "Preusig", formato.parse("1989-06-02"), "32097781440/565", 32097781440L, 565);
            adicionarFuncionarioDadosEmpresa(20100150007L, "Tzvetan", "Zielinski", formato.parse("1989-02-10"), "45521773009/130", 45521773009L, 130);
            adicionarFuncionarioDadosEmpresa(20100150008L, "Saniya", "Kalloufi", formato.parse("1994-09-15"), "61346916570/146", 61346916570L, 146);
            adicionarFuncionarioDadosEmpresa(20100150009L, "Sumant", "Peac", formato.parse("1985-02-18"), "97392551134/059", 97392551134L, 59);
            adicionarFuncionarioDadosEmpresa(20100150010L, "Duangkaew", "Piveteau", formato.parse("1989-08-24"), "67883327357/459", 67883327357L, 459);
            adicionarFuncionarioDadosEmpresa(20100150011L, "Mary", "Sluis", formato.parse("1990-01-22"), "27643038714/533", 27643038714L, 533);
            adicionarFuncionarioDadosEmpresa(20100150012L, "Patricio", "Bridgland", formato.parse("1992-12-18"), "21351765725/934", 21351765725L, 934);
            adicionarFuncionarioDadosEmpresa(20100150013L, "Eberhardt", "Terkki", formato.parse("1985-10-20"), "56169715657/667", 56169715657L, 667);
            adicionarFuncionarioDadosEmpresa(20100150014L, "Berni", "Genin", formato.parse("1987-03-11"), "65552228659/809", 65552228659L, 809);
            adicionarFuncionarioDadosEmpresa(20100150015L, "Guoxiang", "Nooteboom", formato.parse("1987-07-02"), "53561554492/173", 53561554492L, 173);
            adicionarFuncionarioDadosEmpresa(20100150016L, "Kazuhito", "Cappelletti", formato.parse("1995-01-27"), "75799810902/082", 75799810902L, 82);
            adicionarFuncionarioDadosEmpresa(20100150017L, "Cristinel", "Bouloucos", formato.parse("1993-08-03"), "34272721832/847", 34272721832L, 847);
            adicionarFuncionarioDadosEmpresa(20100150018L, "Kazuhide", "Peha", formato.parse("1987-04-03"), "65049299321/002", 65049299321L, 2);
            adicionarFuncionarioDadosEmpresa(20100150019L, "Lillian", "Haddadi", formato.parse("1999-04-30"), "03749683835/747", 3749683835L, 747);
            adicionarFuncionarioDadosEmpresa(20100150020L, "Mayuko", "Warwick", formato.parse("1991-01-26"), "82922368055/587", 82922368055L, 587);
            adicionarFuncionarioDadosEmpresa(20100150021L, "Ramzi", "Erde", formato.parse("1988-02-10"), "55975941650/126", 55975941650L, 126);
            adicionarFuncionarioDadosEmpresa(20100150022L, "Shahaf", "Famili", formato.parse("1995-08-22"), "09461350299/421", 9461350299L, 421);
            adicionarFuncionarioDadosEmpresa(20100150023L, "Bojan", "Montemayor", formato.parse("1989-12-17"), "35312125304/068", 35312125304L, 68);
            adicionarFuncionarioDadosEmpresa(20100150024L, "Suzette", "Pettey", formato.parse("1997-05-19"), "37744575045/062", 37744575045L, 62);
            adicionarFuncionarioDadosEmpresa(20100150025L, "Prasadram", "Heyers", formato.parse("1987-08-17"), "72800069469/691", 72800069469L, 691);
            adicionarFuncionarioDadosEmpresa(20100150026L, "Yongqiao", "Berztiss", formato.parse("1995-03-20"), "76590534104/044", 76590534104L, 44);
            adicionarFuncionarioDadosEmpresa(20100150027L, "Divier", "Reistad", formato.parse("1989-07-07"), "11078984500/735", 11078984500L, 735);
            adicionarFuncionarioDadosEmpresa(20100150028L, "Domenick", "Tempesti", formato.parse("1991-10-22"), "09682082882/256", 9682082882L, 256);
            adicionarFuncionarioDadosEmpresa(20100150029L, "Otmar", "Herbst", formato.parse("1985-11-20"), "06101442854/028", 6101442854L, 28);
            adicionarFuncionarioDadosEmpresa(20100150030L, "Elvis", "Demeyer", formato.parse("1994-02-17"), "72135364273/029", 72135364273L, 29);
            adicionarFuncionarioDadosEmpresa(20100150031L, "Karsten", "Joslin", formato.parse("1991-09-01"), "53844377143/318", 53844377143L, 318);
            adicionarFuncionarioDadosEmpresa(20100150032L, "Jeong", "Reistad", formato.parse("1990-06-20"), "58052711560/382", 58052711560L, 382);
            adicionarFuncionarioDadosEmpresa(20100150033L, "Arif", "Merlo", formato.parse("1987-03-18"), "60934193230/510", 60934193230L, 510);
            adicionarFuncionarioDadosEmpresa(20100150034L, "Bader", "Swan", formato.parse("1988-09-21"), "82366164689/764", 82366164689L, 764);
            adicionarFuncionarioDadosEmpresa(20100150035L, "Alain", "Chappelet", formato.parse("1988-09-05"), "45605253507/166", 45605253507L, 166);
            adicionarFuncionarioDadosEmpresa(20100150036L, "Adamantios", "Portugali", formato.parse("1992-01-03"), "02963787771/099", 2963787771L, 99);
            adicionarFuncionarioDadosEmpresa(20100150037L, "Pradeep", "Makrucki", formato.parse("1990-12-05"), "97972424715/524", 97972424715L, 524);
            adicionarFuncionarioDadosEmpresa(20100150038L, "Huan", "Lortz", formato.parse("1989-09-20"), "17629338304/457", 17629338304L, 457);
            adicionarFuncionarioDadosEmpresa(20100150039L, "Alejandro", "Brender", formato.parse("1988-01-19"), "44161849229/838", 44161849229L, 838);
            adicionarFuncionarioDadosEmpresa(20100150040L, "Weiyi", "Meriste", formato.parse("1993-02-14"), "62646465546/402", 62646465546L, 402);
            adicionarFuncionarioDadosEmpresa(20100150041L, "Uri", "Lenart", formato.parse("1989-11-12"), "63241740875/557", 63241740875L, 557);
            adicionarFuncionarioDadosEmpresa(20100150042L, "Magy", "Stamatiou", formato.parse("1993-03-21"), "24895081696/971", 24895081696L, 971);
            adicionarFuncionarioDadosEmpresa(20100150043L, "Yishay", "Tzvieli", formato.parse("1990-10-20"), "02078299841/502", 2078299841L, 502);
            adicionarFuncionarioDadosEmpresa(20100150044L, "Mingsen", "Casley", formato.parse("1994-05-21"), "15513957389/836", 15513957389L, 836);
            adicionarFuncionarioDadosEmpresa(20100150045L, "Moss", "Shanbhogue", formato.parse("1989-09-02"), "83386267804/056", 83386267804L, 56);
            adicionarFuncionarioDadosEmpresa(20100150046L, "Lucien", "Rosenbaum", formato.parse("1992-06-20"), "03392547975/879", 3392547975L, 879);
            adicionarFuncionarioDadosEmpresa(20100150047L, "Zvonko", "Nyanchama", formato.parse("1989-03-31"), "23921039794/697", 23921039794L, 697);
            adicionarFuncionarioDadosEmpresa(20100150048L, "Florian", "Syrotiuk", formato.parse("1985-02-24"), "70523670700/456", 70523670700L, 456);
            adicionarFuncionarioDadosEmpresa(20100150049L, "Basil", "Tramer", formato.parse("1992-05-04"), "07579143180/332", 7579143180L, 332);
            adicionarFuncionarioDadosEmpresa(20100150050L, "Yinghua", "Dredge", formato.parse("1990-12-25"), "57482762711/308", 57482762711L, 308);
            adicionarFuncionarioDadosEmpresa(20100150051L, "Hidefumi", "Caine", formato.parse("1992-10-15"), "57906770375/697", 57906770375L, 697);
            adicionarFuncionarioDadosEmpresa(20100150052L, "Heping", "Nitsch", formato.parse("1988-05-21"), "52844491970/084", 52844491970L, 84);
            adicionarFuncionarioDadosEmpresa(20100150053L, "Sanjiv", "Zschoche", formato.parse("1986-02-04"), "13472030680/807", 13472030680L, 807);
            adicionarFuncionarioDadosEmpresa(20100150054L, "Mayumi", "Schueller", formato.parse("1995-03-13"), "32422319426/138", 32422319426L, 138);
            adicionarFuncionarioDadosEmpresa(20100150055L, "Georgy", "Dredge", formato.parse("1992-04-27"), "32176781997/692", 32176781997L, 692);
            adicionarFuncionarioDadosEmpresa(20100150056L, "Brendon", "Bernini", formato.parse("1990-02-01"), "84791150484/904", 84791150484L, 904);
            adicionarFuncionarioDadosEmpresa(20100150057L, "Ebbe", "Callaway", formato.parse("1992-01-15"), "54785488828/334", 54785488828L, 334);
            adicionarFuncionarioDadosEmpresa(20100150058L, "Berhard", "McFarlin", formato.parse("1987-04-13"), "28822126792/575", 28822126792L, 575);
            adicionarFuncionarioDadosEmpresa(20100150059L, "Alejandro", "McAlpine", formato.parse("1991-06-26"), "47165528899/061", 47165528899L, 61);
            adicionarFuncionarioDadosEmpresa(20100150060L, "Breannda", "Billingsley", formato.parse("1987-11-02"), "01198453117/675", 1198453117L, 675);
            adicionarFuncionarioDadosEmpresa(20100150061L, "Tse", "Herber", formato.parse("1985-09-17"), "37256577881/685", 37256577881L, 685);
            adicionarFuncionarioDadosEmpresa(20100150062L, "Anoosh", "Peyn", formato.parse("1991-08-30"), "02309861517/765", 2309861517L, 765);
            adicionarFuncionarioDadosEmpresa(20100150063L, "Gino", "Leonhardt", formato.parse("1989-04-08"), "32253012661/935", 32253012661L, 935);
            adicionarFuncionarioDadosEmpresa(20100150064L, "Udi", "Jansch", formato.parse("1985-11-20"), "09059042917/182", 9059042917L, 182);
            adicionarFuncionarioDadosEmpresa(20100150065L, "Satosi", "Awdeh", formato.parse("1988-05-18"), "02405475379/917", 2405475379L, 917);
            adicionarFuncionarioDadosEmpresa(20100150066L, "Kwee", "Schusler", formato.parse("1986-02-26"), "10728680729/242", 10728680729L, 242);
            adicionarFuncionarioDadosEmpresa(20100150067L, "Claudi", "Stavenow", formato.parse("1987-03-04"), "65827388713/150", 65827388713L, 150);
            adicionarFuncionarioDadosEmpresa(20100150068L, "Charlene", "Brattka", formato.parse("1987-08-07"), "75880040060/867", 75880040060L, 867);
            adicionarFuncionarioDadosEmpresa(20100150069L, "Margareta", "Bierman", formato.parse("1989-11-05"), "85605026412/306", 85605026412L, 306);
            adicionarFuncionarioDadosEmpresa(20100150070L, "Reuven", "Garigliano", formato.parse("1985-10-14"), "37559165665/446", 37559165665L, 446);
            adicionarFuncionarioDadosEmpresa(20100150071L, "Hisao", "Lipner", formato.parse("1987-10-01"), "41889623623/335", 41889623623L, 335);
            adicionarFuncionarioDadosEmpresa(20100150072L, "Hironoby", "Sidou", formato.parse("1988-07-21"), "82209004838/740", 82209004838L, 740);
            adicionarFuncionarioDadosEmpresa(20100150073L, "Shir", "McClurg", formato.parse("1991-12-01"), "04665600450/306", 4665600450L, 306);
            adicionarFuncionarioDadosEmpresa(20100150074L, "Mokhtar", "Bernatsky", formato.parse("1990-08-13"), "40027548393/602", 40027548393L, 602);
            adicionarFuncionarioDadosEmpresa(20100150075L, "Gao", "Dolinsky", formato.parse("1987-03-19"), "14872133812/350", 14872133812L, 350);
            adicionarFuncionarioDadosEmpresa(20100150076L, "Erez", "Ritzmann", formato.parse("1985-07-09"), "55556918844/203", 55556918844L, 203);
            adicionarFuncionarioDadosEmpresa(20100150077L, "Mona", "Azuma", formato.parse("1990-03-02"), "01656581833/096", 1656581833L, 96);
            adicionarFuncionarioDadosEmpresa(20100150078L, "Danel", "Mondadori", formato.parse("1987-05-26"), "35032056016/442", 35032056016L, 442);
            adicionarFuncionarioDadosEmpresa(20100150079L, "Kshitij", "Gils", formato.parse("1986-03-27"), "77109076972/663", 77109076972L, 663);
            adicionarFuncionarioDadosEmpresa(20100150080L, "Premal", "Baek", formato.parse("1985-11-19"), "96290236354/376", 96290236354L, 376);
            adicionarFuncionarioDadosEmpresa(20100150081L, "Zhongwei", "Rosen", formato.parse("1986-10-30"), "52422014236/505", 52422014236L, 505);
            adicionarFuncionarioDadosEmpresa(20100150082L, "Parviz", "Lortz", formato.parse("1990-01-03"), "85442167380/393", 85442167380L, 393);
            adicionarFuncionarioDadosEmpresa(20100150083L, "Vishv", "Zockler", formato.parse("1987-03-31"), "84683334806/128", 84683334806L, 128);
            adicionarFuncionarioDadosEmpresa(20100150084L, "Tuval", "Kalloufi", formato.parse("1995-12-15"), "73710901529/708", 73710901529L, 708);
            adicionarFuncionarioDadosEmpresa(20100150085L, "Kenroku", "Malabarba", formato.parse("1994-04-09"), "28564346010/833", 28564346010L, 833);
            adicionarFuncionarioDadosEmpresa(20100150086L, "Somnath", "Foote", formato.parse("1990-02-16"), "48365007215/793", 48365007215L, 793);
            adicionarFuncionarioDadosEmpresa(20100150087L, "Xinglin", "Eugenio", formato.parse("1986-09-08"), "88760489641/616", 88760489641L, 616);
            adicionarFuncionarioDadosEmpresa(20100150088L, "Jungsoon", "Syrzycki", formato.parse("1988-09-02"), "24800242787/864", 24800242787L, 864);
            adicionarFuncionarioDadosEmpresa(20100150089L, "Sudharsan", "Flasterstein", formato.parse("1986-08-12"), "55192392240/231", 55192392240L, 231);
            adicionarFuncionarioDadosEmpresa(20100150090L, "Kendra", "Hofting", formato.parse("1986-03-14"), "72106547895/158", 72106547895L, 158);
            adicionarFuncionarioDadosEmpresa(20100150091L, "Amabile", "Gomatam", formato.parse("1992-11-18"), "14773865215/855", 14773865215L, 855);
            adicionarFuncionarioDadosEmpresa(20100150092L, "Valdiodio", "Niizuma", formato.parse("1989-09-22"), "31982094456/526", 31982094456L, 526);
            adicionarFuncionarioDadosEmpresa(20100150093L, "Sailaja", "Desikan", formato.parse("1996-11-05"), "78106852839/739", 78106852839L, 739);
            adicionarFuncionarioDadosEmpresa(20100150094L, "Arumugam", "Ossenbruggen", formato.parse("1987-04-18"), "43580655172/836", 43580655172L, 836);
            adicionarFuncionarioDadosEmpresa(20100150095L, "Hilari", "Morton", formato.parse("1986-07-15"), "99840986933/028", 99840986933L, 28);
            adicionarFuncionarioDadosEmpresa(20100150096L, "Jayson", "Mandell", formato.parse("1990-01-14"), "06455084393/495", 6455084393L, 495);
            adicionarFuncionarioDadosEmpresa(20100150097L, "Remzi", "Waschkowski", formato.parse("1990-09-15"), "07821213482/222", 7821213482L, 222);
            adicionarFuncionarioDadosEmpresa(20100150098L, "Sreekrishna", "Servieres", formato.parse("1985-05-13"), "26743944253/401", 26743944253L, 401);
            adicionarFuncionarioDadosEmpresa(20100150099L, "Valter", "Sullins", formato.parse("1988-10-18"), "31864457608/611", 31864457608L, 611);
            adicionarFuncionarioDadosEmpresa(20100150100L, "Hironobu", "Haraldson", formato.parse("1987-09-21"), "20743913583/309", 20743913583L, 309);
            adicionarFuncionarioDadosEmpresa(20100150101L, "Perla", "Heyers", formato.parse("1992-12-28"), "36669869137/735", 36669869137L, 735);
        } catch (ParseException ex) {
            System.err.println("Erro na conversação de data, verifique o formato");
        }

    }

    private static void inicializarFuncionarioDadosPessoais() {
        funcionariosDadosPessoais = new ArrayList();
        formato = new SimpleDateFormat("yyyy-MM-dd");
        try {

            adicionarFuncionariosDadosPessoais(10002, 20100150001L, "Georgi", "Facello", 'M', formato.parse("1953-09-02"), "facello.georgi@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10003, 20100150002L, "Bezalel", "Simmel", 'F', formato.parse("1964-06-02"), "simmel.bezalel@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10004, 20100150003L, "Parto", "Bamford", 'M', formato.parse("1959-12-03"), "bamford.parto@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10005, 20100150004L, "Chirstian", "Koblick", 'M', formato.parse("1954-05-01"), "koblick.chirstian@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10006, 20100150005L, "Kyoichi", "Maliniak", 'M', formato.parse("1955-01-21"), "maliniak.kyoichi@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10007, 20100150006L, "Anneke", "Preusig", 'F', formato.parse("1953-04-20"), "preusig.anneke@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10008, 20100150007L, "Tzvetan", "Zielinski", 'F', formato.parse("1957-05-23"), "zielinski.tzvetan@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10009, 20100150008L, "Saniya", "Kalloufi", 'M', formato.parse("1958-02-19"), "kalloufi.saniya@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10010, 20100150009L, "Sumant", "Peac", 'F', formato.parse("1952-04-19"), "peac.sumant@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10011, 20100150010L, "Duangkaew", "Piveteau", 'F', formato.parse("1963-06-01"), "piveteau.duangkaew@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10012, 20100150011L, "Mary", "Sluis", 'F', formato.parse("1963-06-01"), "sluis.mary@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10013, 20100150012L, "Patricio", "Bridgland", 'M', formato.parse("1960-10-04"), "bridgland.patricio@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10014, 20100150013L, "Eberhardt", "Terkki", 'M', formato.parse("1963-06-07"), "terkki.eberhardt@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10015, 20100150014L, "Berni", "Genin", 'M', formato.parse("1956-02-12"), "genin.berni@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10016, 20100150015L, "Guoxiang", "Nooteboom", 'M', formato.parse("1959-08-19"), "nooteboom.guoxiang@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10017, 20100150016L, "Kazuhito", "Cappelletti", 'M', formato.parse("1961-05-02"), "cappelletti.kazuhito@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10018, 20100150017L, "Cristinel", "Bouloucos", 'F', formato.parse("1958-07-06"), "bouloucos.cristinel@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10019, 20100150018L, "Kazuhide", "Peha", 'F', formato.parse("1954-06-19"), "peha.kazuhide@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10020, 20100150019L, "Lillian", "Haddadi", 'M', formato.parse("1953-01-23"), "haddadi.lillian@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10021, 20100150020L, "Mayuko", "Warwick", 'M', formato.parse("1952-12-24"), "warwick.mayuko@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10022, 20100150021L, "Ramzi", "Erde", 'M', formato.parse("1960-02-20"), "erde.ramzi@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10023, 20100150022L, "Shahaf", "Famili", 'M', formato.parse("1952-07-08"), "famili.shahaf@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10024, 20100150023L, "Bojan", "Montemayor", 'F', formato.parse("1953-09-29"), "montemayor.bojan@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10025, 20100150024L, "Suzette", "Pettey", 'F', formato.parse("1958-09-05"), "pettey.suzette@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10026, 20100150025L, "Prasadram", "Heyers", 'M', formato.parse("1958-10-31"), "heyers.prasadram@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10027, 20100150026L, "Yongqiao", "Berztiss", 'M', formato.parse("1953-04-03"), "berztiss.yongqiao@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10028, 20100150027L, "Divier", "Reistad", 'F', formato.parse("1962-07-10"), "reistad.divier@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10029, 20100150028L, "Domenick", "Tempesti", 'M', formato.parse("1963-11-26"), "tempesti.domenick@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10030, 20100150029L, "Otmar", "Herbst", 'M', formato.parse("1956-12-13"), "herbst.otmar@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10031, 20100150030L, "Elvis", "Demeyer", 'M', formato.parse("1958-07-14"), "demeyer.elvis@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10032, 20100150031L, "Karsten", "Joslin", 'M', formato.parse("1959-01-27"), "joslin.karsten@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10033, 20100150032L, "Jeong", "Reistad", 'F', formato.parse("1960-08-09"), "reistad.jeong@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10034, 20100150033L, "Arif", "Merlo", 'M', formato.parse("1956-11-14"), "merlo.arif@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10035, 20100150034L, "Bader", "Swan", 'M', formato.parse("1962-12-29"), "swan.bader@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10036, 20100150035L, "Alain", "Chappelet", 'M', formato.parse("1953-02-08"), "chappelet.alain@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10037, 20100150036L, "Adamantios", "Portugali", 'M', formato.parse("1959-08-10"), "portugali.adamantios@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10038, 20100150037L, "Pradeep", "Makrucki", 'M', formato.parse("1963-07-22"), "makrucki.pradeep@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10039, 20100150038L, "Huan", "Lortz", 'M', formato.parse("1960-07-20"), "lortz.huan@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10040, 20100150039L, "Alejandro", "Brender", 'M', formato.parse("1959-10-01"), "brender.alejandro@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10041, 20100150040L, "Weiyi", "Meriste", 'F', formato.parse("1959-09-13"), "meriste.weiyi@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10042, 20100150041L, "Uri", "Lenart", 'F', formato.parse("1959-08-27"), "lenart.uri@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10043, 20100150042L, "Magy", "Stamatiou", 'F', formato.parse("1956-02-26"), "stamatiou.magy@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10044, 20100150043L, "Yishay", "Tzvieli", 'M', formato.parse("1960-09-19"), "tzvieli.yishay@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10045, 20100150044L, "Mingsen", "Casley", 'F', formato.parse("1961-09-21"), "casley.mingsen@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10046, 20100150045L, "Moss", "Shanbhogue", 'M', formato.parse("1957-08-14"), "shanbhogue.moss@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10047, 20100150046L, "Lucien", "Rosenbaum", 'M', formato.parse("1960-07-23"), "rosenbaum.lucien@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10048, 20100150047L, "Zvonko", "Nyanchama", 'M', formato.parse("1952-06-29"), "nyanchama.zvonko@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10049, 20100150048L, "Florian", "Syrotiuk", 'M', formato.parse("1963-07-11"), "syrotiuk.florian@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10050, 20100150049L, "Basil", "Tramer", 'F', formato.parse("1961-04-24"), "tramer.basil@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10051, 20100150050L, "Yinghua", "Dredge", 'M', formato.parse("1958-05-21"), "dredge.yinghua@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10052, 20100150051L, "Hidefumi", "Caine", 'M', formato.parse("1953-07-28"), "caine.hidefumi@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10053, 20100150052L, "Heping", "Nitsch", 'M', formato.parse("1961-02-26"), "nitsch.heping@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10054, 20100150053L, "Sanjiv", "Zschoche", 'F', formato.parse("1954-09-13"), "zschoche.sanjiv@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10055, 20100150054L, "Mayumi", "Schueller", 'M', formato.parse("1957-04-04"), "schueller.mayumi@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10056, 20100150055L, "Georgy", "Dredge", 'M', formato.parse("1956-06-06"), "dredge.georgy@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10057, 20100150056L, "Brendon", "Bernini", 'F', formato.parse("1961-09-01"), "bernini.brendon@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10058, 20100150057L, "Ebbe", "Callaway", 'F', formato.parse("1954-05-30"), "callaway.ebbe@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10059, 20100150058L, "Berhard", "McFarlin", 'M', formato.parse("1954-10-01"), "mcfarlin.berhard@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10060, 20100150059L, "Alejandro", "McAlpine", 'F', formato.parse("1953-09-19"), "mcalpine.alejandro@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10061, 20100150060L, "Breannda", "Billingsley", 'M', formato.parse("1961-10-15"), "billingsley.breannda@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10062, 20100150061L, "Tse", "Herber", 'M', formato.parse("1962-10-19"), "herber.tse@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10063, 20100150062L, "Anoosh", "Peyn", 'M', formato.parse("1961-11-02"), "peyn.anoosh@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10064, 20100150063L, "Gino", "Leonhardt", 'F', formato.parse("1952-08-06"), "leonhardt.gino@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10065, 20100150064L, "Udi", "Jansch", 'M', formato.parse("1959-04-07"), "jansch.udi@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10066, 20100150065L, "Satosi", "Awdeh", 'M', formato.parse("1963-04-14"), "awdeh.satosi@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10067, 20100150066L, "Kwee", "Schusler", 'M', formato.parse("1952-11-13"), "schusler.kwee@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10068, 20100150067L, "Claudi", "Stavenow", 'M', formato.parse("1953-01-07"), "stavenow.claudi@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10069, 20100150068L, "Charlene", "Brattka", 'M', formato.parse("1962-11-26"), "brattka.charlene@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10070, 20100150069L, "Margareta", "Bierman", 'F', formato.parse("1960-09-06"), "bierman.margareta@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10071, 20100150070L, "Reuven", "Garigliano", 'M', formato.parse("1955-08-20"), "garigliano.reuven@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10072, 20100150071L, "Hisao", "Lipner", 'M', formato.parse("1958-01-21"), "lipner.hisao@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10073, 20100150072L, "Hironoby", "Sidou", 'F', formato.parse("1952-05-15"), "sidou.hironoby@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10074, 20100150073L, "Shir", "McClurg", 'M', formato.parse("1954-02-23"), "mcclurg.shir@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10075, 20100150074L, "Mokhtar", "Bernatsky", 'F', formato.parse("1955-08-28"), "bernatsky.mokhtar@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10076, 20100150075L, "Gao", "Dolinsky", 'F', formato.parse("1960-03-09"), "dolinsky.gao@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10077, 20100150076L, "Erez", "Ritzmann", 'F', formato.parse("1952-06-13"), "ritzmann.erez@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10078, 20100150077L, "Mona", "Azuma", 'M', formato.parse("1964-04-18"), "azuma.mona@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10079, 20100150078L, "Danel", "Mondadori", 'F', formato.parse("1959-12-25"), "mondadori.danel@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10080, 20100150079L, "Kshitij", "Gils", 'F', formato.parse("1961-10-05"), "gils.kshitij@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10081, 20100150080L, "Premal", "Baek", 'M', formato.parse("1957-12-03"), "baek.premal@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10082, 20100150081L, "Zhongwei", "Rosen", 'M', formato.parse("1960-12-17"), "rosen.zhongwei@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10083, 20100150082L, "Parviz", "Lortz", 'M', formato.parse("1963-09-09"), "lortz.parviz@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10084, 20100150083L, "Vishv", "Zockler", 'M', formato.parse("1959-07-23"), "zockler.vishv@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10085, 20100150084L, "Tuval", "Kalloufi", 'M', formato.parse("1960-05-25"), "kalloufi.tuval@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10086, 20100150085L, "Kenroku", "Malabarba", 'M', formato.parse("1962-11-07"), "malabarba.kenroku@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10087, 20100150086L, "Somnath", "Foote", 'M', formato.parse("1962-11-19"), "foote.somnath@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10088, 20100150087L, "Xinglin", "Eugenio", 'F', formato.parse("1959-07-23"), "eugenio.xinglin@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10089, 20100150088L, "Jungsoon", "Syrzycki", 'F', formato.parse("1954-02-25"), "syrzycki.jungsoon@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10090, 20100150089L, "Sudharsan", "Flasterstein", 'F', formato.parse("1963-03-21"), "flasterstein.sudharsan@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10091, 20100150090L, "Kendra", "Hofting", 'M', formato.parse("1961-05-30"), "hofting.kendra@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10092, 20100150091L, "Amabile", "Gomatam", 'M', formato.parse("1955-10-04"), "gomatam.amabile@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10093, 20100150092L, "Valdiodio", "Niizuma", 'F', formato.parse("1964-10-18"), "niizuma.valdiodio@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10094, 20100150093L, "Sailaja", "Desikan", 'M', formato.parse("1964-06-11"), "desikan.sailaja@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10095, 20100150094L, "Arumugam", "Ossenbruggen", 'F', formato.parse("1957-05-25"), "ossenbruggen.arumugam@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10096, 20100150095L, "Hilari", "Morton", 'M', formato.parse("1965-01-03"), "morton.hilari@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10097, 20100150096L, "Jayson", "Mandell", 'M', formato.parse("1954-09-16"), "mandell.jayson@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10098, 20100150097L, "Remzi", "Waschkowski", 'M', formato.parse("1952-02-27"), "waschkowski.remzi@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10099, 20100150098L, "Sreekrishna", "Servieres", 'F', formato.parse("1961-09-23"), "servieres.sreekrishna@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10100, 20100150099L, "Valter", "Sullins", 'F', formato.parse("1956-05-25"), "sullins.valter@acme.com", 1);
            adicionarFuncionariosDadosPessoais(10101, 20100150100L, "Hironobu", "Haraldson", 'F', formato.parse("1953-04-21"), "haraldson.hironobu;@acme.com", 1);

        } catch (ParseException ex) {
            System.err.println("Erro na conversação de data, verifique o formato");
        }

    }

    public static ArrayList<FuncionarioPojo> inicializaodeFuncionarios() {
        Date dataInsert = new Date(System.currentTimeMillis());
        funcionarios = new ArrayList();
        getFuncionarioDadosPessoais()
                .stream()
                .forEach(t -> {
                    getFuncionarioDadosEmpresa()
                            .stream()
                            .filter(s -> s.getChaveID() == t.getChaveID())
                            .forEach(r -> {

                                AdicionarFuncionario(
                                        t.getFuncionarioID(),
                                        r.getChaveID(),
                                        r.getNome(),
                                        r.getSobreNome(),
                                        t.getSexo(),
                                        t.getDataNascimento(),
                                        t.getEmail(),
                                        r.getCtps(),
                                        r.getCtpsNum(),
                                        r.getCtpsSerie(),
                                        t.getPaisID(),
                                        r.getDataDeAdmissao(),
                                        dataInsert
                                );

                            });

                });
        return funcionarios;
    }

    private static void AdicionarFuncionario(
            int funcionarioID,
            long chaveID,
            String nome,
            String sobreNome,
            char sexo,
            Date dataNascimento,
            String email,
            String ctps,
            long ctpsNum,
            int ctpsSerie,
            int paisID,
            Date dataDeAdmissao,
            Date dataInsert
    ) {
        FuncionarioPojo f = new FuncionarioPojo();
        f.setFuncionarioID(funcionarioID);
        f.setChaveID(chaveID);
        f.setNome(nome);
        f.setSobreNome(sobreNome);
        f.setSexo(sexo);
        f.setDataNascimento(dataNascimento);
        f.setEmail(email);
        f.setCtps(ctps);
        f.setCtpsNum(ctpsNum);
        f.setCtpsSerie(ctpsSerie);
        f.setPaisID(paisID);
        f.setDataDeAdmissao(dataDeAdmissao);
        f.setDataInsert(dataInsert);
        funcionarios.add(f);
    }

    private static void adicionarFuncionarioDadosEmpresa(
            long chaveID,
            String nome,
            String sobreNome,
            Date dataDeAdmissao,
            String ctps,
            long ctpsNum,
            int ctpsSerie
    ) {
        FuncionarioDadosEmpresa f = new FuncionarioDadosEmpresa();
        f.setChaveID(chaveID);
        f.setNome(nome);
        f.setSobreNome(sobreNome);
        f.setDataDeAdmissao(dataDeAdmissao);
        f.setCtps(ctps);
        f.setCtpsNum(ctpsNum);
        f.setCtpsSerie(ctpsSerie);
        funcionariosDadosEmpresa.add(f);
    }

    private static void adicionarFuncionariosDadosPessoais(
            int funcionarioID,
            long chaveID,
            String nome,
            String sobreNome,
            char sexo,
            Date dataNascimento,
            String email,
            int paisID
    ) {
        FuncionarioDadosPessoais f = new FuncionarioDadosPessoais();
        f.setFuncionarioID(funcionarioID);
        f.setChaveID(chaveID);
        f.setNome(nome);
        f.setSobreNome(sobreNome);
        f.setSexo(sexo);
        f.setDataNascimento(dataNascimento);
        f.setEmail(email);
        f.setPaisID(paisID);
        funcionariosDadosPessoais.add(f);
    }

    public EmpresaFakeDB() {

    }

}
