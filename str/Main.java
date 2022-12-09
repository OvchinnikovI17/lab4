package str;
import allOther.*;

public class Main {
    public static void main(String[] args) throws AdressNumberException {
        Time time = new Time(WhatTime.MORNING);
        System.out.println(time.describe());
        Newspaper newspaper;
        try{
            newspaper = new Newspaper("");
        } catch (NameError e){
            System.out.println(e.getMessage());
            newspaper = new Newspaper("Новости");
        }
        Corporation corporation = new Corporation("учреждение Акционерного общества гигантских растений");
        corporation.appear();
        newspaper.announcement(corporation.describe(), 0);
        System.out.println(newspaper.describe());
        City city = new City("Давилон");
        System.out.println(city.whereWeAre());
        Bank bank = new Bank("Банк");
        Robber robber = new Robber("Грабители");
        Rob rob = new Rob(true);
        System.out.println(rob.getResult());
        robber.camouflage(false);
        robber.bankLoot(bank, time, rob);
        System.out.println(bank.describe());
        city.announcement("ограбление");
        System.out.println(city.describe());
        Bandit bandit = new Bandit("Бандиты", 40);
        Bandit headBandit = new Bandit("Главный Бандит", 1);
        Car car = new Car();
        car.here();
        bandit.know();
        bandit.come(car);
        bandit.condition(ConditionSet.ALIVE, "никуда");
        headBandit.condition(ConditionSet.DAMAGED, "ухо");
        Police police = new Police("Полицейские");
        System.out.println(bandit.describe());
        FireGun pistol = new FireGun("Пистолет", 10);
        FireGun kar98k = new FireGun("Винтовка", 5);
        FireGun autogun = new FireGun("Автомат", 30);
        Granade granade = new Granade("Граната", 7);
        bandit.addWeapon(pistol);
        bandit.addWeapon(kar98k);
        bandit.addWeapon(autogun);
        bandit.addWeapon(granade);
        System.out.println(bandit.useWeaponFireGun(pistol, police));
        System.out.println(bandit.useWeaponFireGun(kar98k, police));
        System.out.println(bandit.useWeaponFireGun(autogun, police));
        System.out.println(bandit.useWeaponGranade(granade, police));
        System.out.println(police.describe());
        BankWorker bankWorker = new BankWorker("Все Работники банка");
        BankWorker cashier = new BankWorker("Кассир");
        Box box = new Box("Сундук", "несгораемый");
        cashier.isBoxThere(box);
        System.out.println(bandit.useWeaponFireGun(pistol, bankWorker));
        System.out.println(bandit.useWeaponFireGun(autogun, bankWorker));
        System.out.println(bandit.useWeaponFireGun(pistol, cashier));
        System.out.println(bandit.useWeaponFireGun(autogun, cashier));
        System.out.println(bankWorker.describe());
        System.out.println(cashier.describe());
        bandit.getCondition();
        headBandit.getCondition();
        Alone neznayka = new Alone("Незнайка");
        Alone miga = new Alone("Мига");
        Alone kozlik = new Alone("Козлик");
        Alone julio = new Alone("Джулио");
        StockExchange binance = new StockExchange();
        neznayka.come();
        miga.come();
        kozlik.come();
        System.out.println(neznayka.describe());
        System.out.println(miga.describe());
        System.out.println(kozlik.describe());
        int a1 = binance.getAmount();
        Integer b1 = binance.getMoney();
        StockStart shw = new StockStart() {
            @Override
            public String strt(int a1, int b1) {
                return "Информация о бирже: кол-во акций: " + String.valueOf(a1) + ", кол-во денег: " + String.valueOf(b1);
            }
        };
        System.out.println(shw.strt(a1, b1));
        System.out.println(binance.buy(3, neznayka));
        Buyer buyer = new Buyer("Покупатели акций");
        System.out.println(buyer.describe());
        Adress adress = new Adress();
        try{
            adress.setAdress("Кривая улица", "47");
        } catch (AdressNumberException e){
            System.out.println(e.getMessage());
        }
        ShowInfo showInfo = (a, b) -> "Информация о бирже: кол-во акций: " + String.valueOf(a) + ", кол-во денег: " + String.valueOf(b);
        int a = binance.getAmount();
        Integer b = binance.getMoney();
        System.out.println(showInfo.inf(a, b));
        julio.come();
        julio.know();
        System.out.println(julio.describe());
        julio.tell("о ограблении ", neznayka);
        julio.tell("о ограблении ", miga);
        julio.tell("о ограблении ", kozlik);
        newspaper.announcement("ограбление банка", 0);
        System.out.println(newspaper.describe());
        Fake fake = new Fake("Кол-во бандитов", "2", bandit.getAmount());
        newspaper.announcement(fake.describe(), 0);
        System.out.println(newspaper.describe());
        robber.condition(ConditionSet.ALIVE);
        police.condition(ConditionSet.ALIVE);
        robber.come("в банк");
        robber.made("закрыл дверь");
        System.out.println(robber.describe());
        System.out.println(robber.camoMode());
        robber.opponentMustDoSmth(bankWorker, "лечь на пол", "лицом в пол");
        CashPlace cashPlace = new CashPlace();
        robber.opponentMustDoSmth(cashier, "открыть", cashPlace.describe());
        robber.made("выгреб деньги из кассы");
        System.out.println(robber.describe());
        Case suitcase = new Case();
        System.out.println(suitcase.put("деньги", robber));
        System.out.println(suitcase.describe());
        cashier.isBoxThere(box);
        robber.made("взял чемодан");
        robber.come("на улицу");
        System.out.println(robber.describe());
        BankWorker oneWomen = new BankWorker("Работница");
        oneWomen.notice();
        Button button = new Button();
        Button.ColorButton colorButton = new Button.ColorButton();
        colorButton.color();
        button.press(oneWomen);
        button.start();
        System.out.println(button.describe());
        police.made();
        police.come();
        System.out.println(police.describe());
        police.hearSignal(button);
        System.out.println(robber.rideAway());
        System.out.println(police.rideAway());
        police.nearCar(true, robber);
        System.out.println(police.getCondition());
        Police two_cars = new Police("две машины с полицей");
        System.out.println(robber.rideAway());
        System.out.println(two_cars.rideAway());
        two_cars.nearCar(true, robber);
        System.out.println(two_cars.getCondition());
        Alone quietRobber = new Alone("сообщники");
        suitcase.lost();
        System.out.println(suitcase.isLost(robber));
        robber.know("ничего");
        robber.come("в полицейский отдел");
        robber.made("не грабили");
        System.out.println(robber.describe());
        Alone pshigal = new Alone("Пшигаль");
        System.out.println(pshigal.ask("зачем стрелять по машинам", robber));
        robber.know("не знал, что за ними гонятся " + police.getName());
        System.out.println(robber.describe());
        System.out.println(pshigal.ask("не врет ли ему", robber));
        robber.announcement(robber.camouflage(true, "Полицейская форма"));
        newspaper.announcement("разговор " + pshigal.getName() + " с " + robber.getName(), 1);
        System.out.println(newspaper.describe());
        Cash cash = new Cash("фертинги");
        newspaper.announcement("В " + suitcase.getName() + " лежало 3.5 миллиона " + cash.describe(), 0);
        System.out.println(newspaper.describe());
        newspaper.announcement(police.getCondition() + " 7 человек", 0);
        System.out.println(newspaper.describe());
        Clothe pants = new Clothe("штаны");
        Clothe helmet = new Clothe("каска");
        pshigal.lost(pants);
        pshigal.lost(helmet);
        System.out.println(pshigal.whatLost());
        newspaper.announcement("читатели, поделитесь мыслиями о случившимся", 0);
        System.out.println(newspaper.describe());
        Alone every = new Alone("каждый");
        System.out.println(police.reward(every, "грабителях", "денег"));
        Alone readers = new Alone("читатели");
        readers.share("мыслями о ситуцации");
        System.out.println(readers.getShare());
        time.setTime(WhatTime.DAY);
        suitcase.put("ничего", robber);
        System.out.println(time.describe());
        newspaper.setCategory("Письма читателей");
        System.out.println(newspaper.getCategory());
        Alone gops = new Alone("Гопс");
        Alone persik = new Alone("Персик");
        newspaper.announcement( suitcase.getName() + " выброшен из " + car.describe() + " - " + gops.getName(), 0);
        System.out.println(newspaper.describe());
        System.out.println(gops.sayBad(police, "тупоголовый"));
        newspaper.announcement(suitcase.getName() + " подобран " + quietRobber.getName() + " - " + persik.getName(), 0);
        System.out.println(newspaper.describe());
        System.out.println(persik.sayBad(police, "безмозглый"));
        Alone truhtiandlopushok = new Alone("Трухти и Лопушок");
        newspaper.announcement(cash.describe() + " украл " + cashier.getName() + ", " + suitcase.describe() + " - " + truhtiandlopushok.getName(), 0);
        System.out.println(newspaper.describe());
        Alone kaktus = new Alone("Кактус");
        newspaper.announcement(cash.describe() + " находятся во дворе дома " + adress.describe() + " - " + kaktus.getName(), 0);
        System.out.println(newspaper.describe());
        System.out.println(kaktus.sayGood(police, "успеха и счастья"));
        System.out.println(kaktus.canDo("печатать", Consistence.GOOD));
        System.out.println(kaktus.canDo("готовить", Consistence.GOOD));
        System.out.println(kaktus.canDo("играть на трубе", Consistence.GOOD));
        Alone byzoni = new Alone("Бузони");
        Adress byzoni_adress = new Adress();
        try{
            byzoni_adress.setAdress("Крысинская горка", "16");
        } catch (AdressNumberException e){
            System.out.println(e.getMessage());
        }
        newspaper.announcement(police.getName() + " погнались не за теми, вознаграждение " + byzoni_adress.describe() + " - " + byzoni.getName(), 0);
        System.out.println(newspaper.describe());
        System.out.println(byzoni.sayBad(police, "тупоголовый"));
    }
}