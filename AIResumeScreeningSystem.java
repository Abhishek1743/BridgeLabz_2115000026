import java.util.*;

//Abstract class representing a Job Role
abstract class JobRole{
    private String candidateName;
    private String resumeContent;

    public JobRole(String candidateName, String resumeContent){
        this.candidateName = candidateName;
        this.resumeContent = resumeContent;
    }

    public String getCandidateName(){
        return candidateName;
    }

    public String getResumeContent(){
        return resumeContent;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + " - Candidate: " + candidateName;
    }
}

//Specific job roles
class SoftwareEngineer extends JobRole{
    public SoftwareEngineer(String candidateName, String resumeContent){
        super(candidateName, resumeContent);
    }
}

class DataScientist extends JobRole{
    public DataScientist(String candidateName, String resumeContent){
        super(candidateName, resumeContent);
    }
}

class ProductManager extends JobRole{
    public ProductManager(String candidateName, String resumeContent){
        super(candidateName, resumeContent);
    }
}

//Generic Resume class
class Resume<T extends JobRole>{
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume){
        resumes.add(resume);
    }

    public List<T> getResumes(){
        return resumes;
    }
}

//Utility class for screening resumes
class ResumeScreeningUtil{
    public static void screenResumes(List<? extends JobRole> resumes){
        System.out.println("Screening Resumes:");
        for (JobRole resume : resumes){
            System.out.println(resume);
        }
    }
}

//Main Class
public class AIResumeScreeningSystem{
    public static void main(String[] args){
		
		//Creating resumes
        Resume<SoftwareEngineer> softwareResumes = new Resume<>();
        softwareResumes.addResume(new SoftwareEngineer("Abhishek", "Java, Spring Boot, Microservices"));
        softwareResumes.addResume(new SoftwareEngineer("Sagar", "Python, Django, REST APIs"));

        Resume<DataScientist> dataResumes = new Resume<>();
        dataResumes.addResume(new DataScientist("Priyanshu", "Machine Learning, TensorFlow, Data Analysis"));
        dataResumes.addResume(new DataScientist("Neymar", "Deep Learning, NLP, Big Data"));
		
		Resume<ProductManager> productResumes = new Resume<>();
		productResumes.addResume(new ProductManager("Ronaldo", "Marketing, Sales, Communication"));
		productResumes.addResume(new ProductManager("Messi", "Marketing, Sales, Communication"));

		//displaying details
        System.out.println("Software Engineer Resumes:");
        ResumeScreeningUtil.screenResumes(softwareResumes.getResumes());
        
        System.out.println("\nData Scientist Resumes:");
        ResumeScreeningUtil.screenResumes(dataResumes.getResumes());
		
		System.out.println("\nData Scientist Resumes:");
        ResumeScreeningUtil.screenResumes(productResumes.getResumes());
    }
}