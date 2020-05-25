public class InDepositState implements IPackageState {
    @Override
    public PackageStatus getStatus() {
        return PackageStatus.InDeposit;
    }
    @Override
    public boolean nextStatus(PackageStatus newStatus, Package pkg) {
        if(pkg.getCurrentStatus().getStatus()== PackageStatus.InDeposit){
            if(newStatus == PackageStatus.PickedForDelivery){
                pkg.setCurrentStatus(new PickedForDeliveryState());
                return true;
            }
            if(newStatus == PackageStatus.Delivered){
                pkg.setCurrentStatus(new DeliveredState());
                return true;
            }
        }

        System.out.println("Cannot change to "+newStatus);
        return false;
    }

    @Override
    public void prevStatus(Package pkg) {
        System.out.println("Cannot go back");
    }
}
