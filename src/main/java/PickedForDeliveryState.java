public class PickedForDeliveryState implements  IPackageState {
    @Override
    public PackageStatus getStatus() {
        return PackageStatus.PickedForDelivery;
    }

    @Override
    public boolean nextStatus(PackageStatus newStatus, Package pkg) {
        if(pkg.getCurrentStatus().getStatus()== PackageStatus.PickedForDelivery){
            if(newStatus == PackageStatus.Delivered) {
                pkg.setCurrentStatus(new DeliveredState());
                return true;
            }
            else if(newStatus == PackageStatus.InDeposit){
                pkg.setCurrentStatus(new InDepositState());
                return true;
            }
        }

        System.out.println("Cannot change to "+newStatus);
        return false;
    }

    @Override
    public void prevStatus(Package pkg) {
        InDepositState depositState = new InDepositState();
        pkg.setCurrentStatus(depositState);
    }
}
