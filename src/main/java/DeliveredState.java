public class DeliveredState implements IPackageState{


    @Override
    public PackageStatus getStatus() {
        return PackageStatus.Delivered;
    }

    @Override
    public boolean nextStatus(PackageStatus newStatus, Package pkg) {
        System.out.println("Delivered. There's no other next step");
        return false;
    }

    @Override
    public void prevStatus(IPackageState state) {
        System.out.println("It's already delivered, cannot go back");
    }
}
