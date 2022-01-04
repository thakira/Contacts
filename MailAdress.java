package model;

public class MailAdress {
    private String mailAdress;

    public MailAdress(String mailAdress) {
        if (checkMailAdress(mailAdress))
            this.mailAdress = mailAdress;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public void setMailAdress(String mailAdress) {
        if (checkMailAdress(mailAdress)) {
            this.mailAdress = mailAdress;
        
    } else { this.mailAdress = "";
    
    }
}

    public static boolean checkMailAdress(String mailAdress) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(mailAdress);
        return m.matches();
    }

    @Override
    public String toString() {
        return mailAdress;
    }
}
