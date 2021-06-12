package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month;
        System.out.print("Doğduğunuz ay : ");
        month = scanner.nextInt();

        if (month>=1 && month<=12) {
            System.out.print("Doğduğunuz gün : ");
            day = scanner.nextInt();
             if (1 == month) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Oğlak Burcu ");
                    } else {
                        System.out.println("Kova Burcu");
                    }
                } else {
                    System.out.println("Hatalı gün girişi yaptınız");
                }
            } else if (2 == month) {
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        System.out.println("Kova Burcu ");
                    } else {
                        System.out.println("Balık Burcu");
                    }
                } else {
                    System.out.println("Hatalı gün girişi yaptınız");
                }
            } else if (3 == month) {
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        System.out.println("Balık Burcu ");
                    } else {
                        System.out.println("Koç Burcu");
                    }
                } else {
                    System.out.println("Hatalı gün girişi yaptınız");
                }
            } else if (4 == month) {
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        System.out.println("Koç Burcu ");
                    } else {
                        System.out.println("Boğa Burcu");
                    }
                } else {
                    System.out.println("Hatalı gün girişi yaptınız");
                }
            } else if (5 == month) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Boğa Burcu ");
                    } else {
                        System.out.println("İkizler Burcu");
                    }
                } else {
                    System.out.println("Hatalı gün girişi yaptınız");
                }
            } else if (6 == month) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        System.out.println("İkizler Burcu ");
                    } else {
                        System.out.println("Yengeç Burcu");
                    }
                } else {
                    System.out.println("Hatalı gün girişi yaptınız");
                }
            } else if (7 == month) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Yengeç Burcu ");
                    } else {
                        System.out.println("Aslan Burcu");
                    }
                } else {
                    System.out.println("Hatalı gün girişi yaptınız");
                }
            } else if (8 == month) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Aslan Burcu ");
                    } else {
                        System.out.println("Başak Burcu");
                    }
                } else {
                    System.out.println("Hatalı gün girişi yaptınız");
                }
            } else if (9 == month) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        System.out.println("Başak Burcu ");
                    } else {
                        System.out.println("Terazi Burcu");
                    }
                } else {
                    System.out.println("Hatalı gün girişi yaptınız");
                }
            } else if (10 == month) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Terazi Burcu ");
                    } else {
                        System.out.println("Akrep Burcu");
                    }
                } else {
                    System.out.println("Hatalı gün girişi yaptınız");
                }
            } else if (11 == month) {
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        System.out.println("Akrep Burcu ");
                    } else {
                        System.out.println("Yay Burcu");
                    }
                } else {
                    System.out.println("Hatalı gün girişi yaptınız");
                }
            } else if (12 == month) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Yay Burcu ");
                    } else {
                        System.out.println("Oğlak Burcu");
                    }
                } else {
                    System.out.println("Hatalı gün girişi yaptınız");
                }
            }
        }
        else {
            System.out.println("Hatalı ay girişi yaptınız.");
        }
        System.out.println();
    }
}
