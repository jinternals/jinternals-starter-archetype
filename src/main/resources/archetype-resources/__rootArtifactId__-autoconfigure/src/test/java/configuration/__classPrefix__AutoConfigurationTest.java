package ${package}.configuration;

import org.junit.Test;
import org.springframework.boot.test.context.runner.WebApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.autoconfigure.AutoConfigurations.of;

public class ${classPrefix}AutoConfigurationTest {

    private WebApplicationContextRunner applicationContextRunner;

    @Test
    public void shouldCreateAutoConfiguredBeanIfStarterIsEnabled() {
        applicationContextRunner = new WebApplicationContextRunner()
                .withPropertyValues(properties(true))
                .withConfiguration(of(${classPrefix}AutoConfiguration.class));

        this.applicationContextRunner.run(context -> {
            assertThat(context).hasBean("${methodPrefix}Service");
        });
    }


    @Test
    public void shouldNotCreateAutoConfiguredBeanIfStarterIsNotEnabled() {
        applicationContextRunner = new WebApplicationContextRunner()
                .withPropertyValues(properties(false))
                .withConfiguration(of(${classPrefix}AutoConfiguration.class));

        this.applicationContextRunner.run(context -> {
            assertThat(context).doesNotHaveBean("${methodPrefix}Service");
        });
    }


    private String[] properties(boolean enabled) {
        return new String[]{
                String.format("${propertyPrefix}.enabled=%b", enabled),
        };
    }

}
