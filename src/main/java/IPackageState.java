public interface IPackageState {
    PackageStatus getStatus();
    boolean nextStatus(PackageStatus newStatus, Package pkg);
    void prevStatus(Package pkg);
}
