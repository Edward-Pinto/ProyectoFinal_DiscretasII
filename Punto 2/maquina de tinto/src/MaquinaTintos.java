public class MaquinaTintos {
    
    public Estados estadoActual;
    private int saldoActual;
    private final int precioTinto = 3500;
    
    // Constructor
    public MaquinaTintos() {
        estadoActual = Estados.E0;  // Estado inicial
        saldoActual = 0;           // Saldo inicial
    }
    
    // Metodo para procesar la entrada según el estado actual
    public void procesarEntrada(String entrada) {
        switch (estadoActual) {
            case E0:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E1;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E2;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E5;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E10;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E20;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "y":
                        System.out.println("Aun no se alcanzo el valor del tinto");
                        break;
                    default:
                        System.out.println("Valor no valido");
                        break;
                }break;
            case E1:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E2;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E3;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E6;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E11;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E21;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "y":
                        System.out.println("Aun no se alcanzo el valor del tinto");
                        break;
                    default:
                        System.out.println("Valor no valido");
                        break;
            
                }break;
            case E2:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E3;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E4;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E5;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E12;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E22;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "y":
                        System.out.println("Aun no se alcanzo el valor del tinto");
                        break;
                    default:
                        System.out.println("Valor no valido");
                        break;
            
                }break;
            case E3:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E4;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E5;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E8;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E13;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E23;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
            case E4:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E5;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E6;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E9;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E14;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E24;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
            case E5:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E6;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E7;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E10;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E15;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E25;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
            case E6:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E7;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E8;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E11;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E16;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E26;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E7:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E8;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E9;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E12;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E17;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E27;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E8:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E9;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E10;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E13;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E18;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E28;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E9:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E10;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E11;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E14;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E19;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E29;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E10:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E11;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E12;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E15;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E20;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E30;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E11:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E12;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E13;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E16;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E21;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E31;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E12:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E13;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E14;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E17;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E22;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E32;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E13:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E14;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E15;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E18;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E23;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E33;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E14:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E15;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E16;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E19;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E24;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.E34;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E15:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E16;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E17;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E20;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E25;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E16:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E17;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E18;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E21;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E26;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E17:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E18;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E19;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E22;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E27;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E18:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E19;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E20;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E23;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E28;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E19:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E20;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E21;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E24;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E29;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E20:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E21;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E22;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E25;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E30;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E21:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E22;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E23;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E26;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E31;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E22:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E23;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E24;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E27;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E32;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E23:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E24;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E25;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E28;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E33;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E24:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E25;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E26;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E29;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.E34;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E25:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E26;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E27;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E30;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E26:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E27;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E28;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E31;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E27:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E28;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E29;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E32;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E28:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E29;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E30;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E33;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E29:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E30;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E31;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.E34;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E30:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E31;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E32;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.ESalida;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E31:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E32;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E33;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.ESalida;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E32:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E33;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.E34;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.ESalida;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E33:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.E34;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.ESalida;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.ESalida;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
                    case E34:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.ESalida;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.ESalida;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.ESalida;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Aun no se alcanzo el valor del tinto");
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;
            case ESalida:
                switch (entrada) {
                    case "100":
                        saldoActual += 100;
                        estadoActual = Estados.ESalida;
                        break;
                    case "200":
                        saldoActual += 200;
                        estadoActual = Estados.ESalida;
                        break;
                    case "500":
                        saldoActual += 500;
                        estadoActual = Estados.ESalida;
                        break;
                    case "1000":
                        saldoActual += 1000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "2000":
                        saldoActual += 2000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "5000":
                        saldoActual += 5000;
                        estadoActual = Estados.ESalida;
                        break;
                    case "10000":
                        saldoActual += 10000;
                        estadoActual = Estados.ESalida;
                        break;
                        case "y":
                            System.out.println("Felicidades por su compra, su vuelto es de: "+ (saldoActual - precioTinto) );
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Entrada no válida.");
                            break;
                    }break;

                default:
                System.out.println("Entrada no válida.");
                break;
            }
    }
    
    // Método para obtener el estado actual (opcional)
    public Estados getEstadoActual() {
        return estadoActual;
    }
}