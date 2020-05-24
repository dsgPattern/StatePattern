public class Package {
    private PackageStatus _currentStatus = PackageStatus.Ordered;

    public void setStatus(PackageStatus status){
        switch (status)
        {
            case Ordered:
                if(_currentStatus== PackageStatus.Ordered){
                    System.out.println("Already in this status");
                    break;
                }
                System.out.println("This is the initial status");
                break;

            case Dispatched:
                if(_currentStatus== PackageStatus.Dispatched){
                    System.out.println("Already in this status");
                    break;
                }
                if(_currentStatus!=PackageStatus.Ordered){
                    System.out.println("Cannot set to Dispatched");
                    break;
                }

                _currentStatus= status;
                System.out.println("Set to Dispatched");
                break;

            case InDeposit:
                if(_currentStatus== PackageStatus.InDeposit){
                    System.out.println("Already in this status");
                    break;
                }
                if(_currentStatus==PackageStatus.Dispatched || _currentStatus == PackageStatus.PickedForDelivery){
                    _currentStatus= status;
                    System.out.println("Set to InDeposit");
                    break;
                }

                _currentStatus= status;
                System.out.println("Cannot set to InDeposit");
                break;

            case PickedForDelivery:
                if(_currentStatus== PackageStatus.PickedForDelivery){
                    System.out.println("Already in this status");
                    break;
                }
                if(_currentStatus==PackageStatus.InDeposit){
                    _currentStatus= status;
                    System.out.println("Set to PickedForDelivery");
                    break;
                }

                _currentStatus= status;
                System.out.println("Cannot set to PickedForDelivery");
                break;

            case Delivered:
                if(_currentStatus== PackageStatus.Delivered){
                    System.out.println("Already in this status");
                    break;
                }
                if(_currentStatus==PackageStatus.PickedForDelivery || _currentStatus == PackageStatus.InDeposit){
                    _currentStatus= status;
                    System.out.println("Set to Delivered");
                    break;
                }

                System.out.println("Cannot set to Delivered");
                break;
        }
    }
}
