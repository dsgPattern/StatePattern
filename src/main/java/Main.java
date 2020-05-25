public class Main {
    public static void main(String[] args)
    {
        Package pack = new Package();
        pack.setNextStatus(new DeliveredState());
        pack.setNextStatus(new InDepositState());
        pack.setNextStatus(new PickedForDeliveryState());
        pack.setNextStatus(new PickedForDeliveryState());
        pack.setNextStatus(new InDepositState());
        pack.setNextStatus(new DeliveredState());

        /*pack.setStatus(PackageStatus.Delivered);
        pack.setStatus(PackageStatus.Dispatched);
        pack.setStatus(PackageStatus.PickedForDelivery);
        pack.setStatus(PackageStatus.InDeposit);
        pack.setStatus(PackageStatus.PickedForDelivery);
        pack.setStatus(PackageStatus.InDeposit);
        pack.setStatus(PackageStatus.Dispatched);*/
    }
}
