package creational.abstractfactory;

interface Program {
    String description = "";
    void getDescription();
}

class CSProgram implements Program {
    String description = "Computer Science";
    public void getDescription() {
        System.out.println(description);
    }
}

class CISProgram implements Program {
    String description = "Computer Information Systems";
    public void getDescription() {
        System.out.println(description);
    }
}

class DAProgram implements Program {
    String description = "Data Analytics";
    public void getDescription() {
        System.out.println(description);
    }
}

class SecurityProgram implements Program {
    String description = "Security";
    public void getDescription() {
        System.out.println(description);
    }
}
class WebTechProgram implements Program {
    String description = "Web Technology";
    public void getDescription() {
        System.out.println(description);
    }
}

class AnalyticsProgram implements Program {
    String description = "Analytics";
    public void getDescription() {
        System.out.println(description);
    }
}

class BSCSProgram extends CSProgram {
    String description = "Bachelor of Science in " + super.description;
    public void getDescription() {
        System.out.println(description);
    }
}
class MSCSProgram extends CSProgram {
    String description = "Master of Science in " + super.description;
    public void getDescription() {
        System.out.println(description);
    }
}

class BSCISProgram extends CISProgram {
    String description = "Bachelor of Science in "+ super.description;
    public void getDescription() {
        System.out.println(description);
    }
}
class MSCISProgram extends CISProgram {
    String description = "Master of Science in " + super.description;
    public void getDescription() {
        System.out.println(description);
    }
}
class MSDAProgram extends DAProgram {
    String description = "Master of Science in " + super.description;
    public void getDescription() {
        System.out.println(description);
    }
}

class CertSecurityProgram extends SecurityProgram {
    String description = "Certificate in "+ super.description;
    public void getDescription() {
        System.out.println(description);
    }
}
class CertWebTechProgram extends WebTechProgram {
    String description = "Certificate in "+ super.description;
    public void getDescription() {
        System.out.println(description);
    }
}
class CertAnalyticsProgram extends AnalyticsProgram {
    String description = "Certificate in " + super.description;
    public void getDescription() {
        System.out.println(description);
    }
}

abstract class ProgramFactory{
    CSProgram createCSProgram() {
        return new CSProgram();
    }
    CISProgram createCISProgram() {
        return new CISProgram();
    }
    DAProgram createDAProgram() {
        return new DAProgram();
    }
    SecurityProgram createCertSecurityProgram() {
        return new CertSecurityProgram();
    }
    WebTechProgram createCertWebTechProgram() {
        return new CertWebTechProgram();
    }
    AnalyticsProgram createCertAnalyticsProgram() {
        return new CertAnalyticsProgram();
    }
}

class BSProgramFactory extends ProgramFactory{
    public CSProgram createCSProgram(){
        return new BSCSProgram();
    }
    public CISProgram createCISProgram(){
        return new BSCISProgram();
    }
}

class MSProgramFactory extends ProgramFactory{
    public CSProgram createCSProgram(){
        return new MSCSProgram();
    }
    public CISProgram createCISProgram(){
        return new MSCISProgram();
    }
    public DAProgram createDAProgram(){
        return new MSDAProgram();
    }
}

class CertProgramFactory extends ProgramFactory{
    public SecurityProgram createSecurityProgram(){
        return new CertSecurityProgram();
    }
    public WebTechProgram createWebTechProgram(){
        return new CertWebTechProgram();
    }
    public AnalyticsProgram createAnalyticsProgram(){
        return new CertAnalyticsProgram();
    }
}

