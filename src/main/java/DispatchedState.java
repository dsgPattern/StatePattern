public class DispatchedState implements IPackageState {
    @Override
    public PackageStatus getStatus() {
        return PackageStatus.Dispatched;
    }

    @Override
    public boolean nextStatus(PackageStatus newStatus, Package pkg) {
        if(pkg.getCurrentStatus().getStatus()== PackageStatus.Dispatched && newStatus==PackageStatus.InDeposit){
            pkg.setCurrentStatus(new InDepositState());
            return true;
        }

        System.out.println("Cannot change state to " + newStatus);
        return false;
    }

    @Override
    public void prevStatus(Package pkg) {
        System.out.println("Cannot go to previous state");
    }
}
