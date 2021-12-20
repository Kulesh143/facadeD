public class SecurityCodeCheck {
    private int securityCode=1234;
    public int getSecurityCode(){
        return securityCode;
    }
    public boolean isSecurityCodeCorrect(int secCodeToCheck){
        if(secCodeToCheck==getSecurityCode()){
            return true;
        }else{
            return false;
        }
    }
}
