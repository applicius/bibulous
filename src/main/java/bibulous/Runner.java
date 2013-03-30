package bibulous;

import org.junit.runners.BlockJUnit4ClassRunner;

import org.junit.runners.model.InitializationError;
import org.junit.runners.model.FrameworkMethod;

/**
 * Custom test runner, using Bibulous annotation for reporting.
 *
 * @author Cedric Chantepie
 * @see TestDoc
 */
public class Runner extends BlockJUnit4ClassRunner {
    /**
     * Runner constructor.
     */
    public Runner(Class c) throws InitializationError {
        super(c);
    } // end of <init>

    /**
     * {@inheritDoc}
     */
    protected String testName(FrameworkMethod method) {
        final TestDoc doc = method.getAnnotation(TestDoc.class);

        if (doc != null) {
            return doc.value();
        } // end of if

        return super.testName(method);
    } // end of testName
} // end of class Runner
