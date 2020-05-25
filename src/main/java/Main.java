public class Main {
    public static void main(String[] args)
    {
        TV tv = new TV();
        tv.powerOff();
        tv.powerOn();
        tv.mute();
        tv.powerOff();
        tv.powerOn();



        /*Package pack = new Package();
        pack.setNextStatus(new DeliveredState());

        InDepositState dState =new InDepositState();
        pack.setNextStatus(dState);
        dState.nextStatus(PackageStatus.PickedForDelivery, pack);

        pack.setNextStatus(new PickedForDeliveryState());
        pack.setNextStatus(new PickedForDeliveryState());
        pack.setNextStatus(new InDepositState());
        pack.setNextStatus(new DeliveredState());*/

        /*pack.setStatus(PackageStatus.Delivered);
        pack.setStatus(PackageStatus.Dispatched);
        pack.setStatus(PackageStatus.PickedForDelivery);
        pack.setStatus(PackageStatus.InDeposit);
        pack.setStatus(PackageStatus.PickedForDelivery);
        pack.setStatus(PackageStatus.InDeposit);
        pack.setStatus(PackageStatus.Dispatched);*/
    }
}
