package Ecommerce.Utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;

import org.testng.annotations.ITestAnnotation;

public class Mytrasnsfomer implements IAnnotationTransformer {
	
	public void transfomer(ITestAnnotation annotation,Class testclass,Constructor testConstructor,Method testMethod) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
		
	}

}
