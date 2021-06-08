import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

public class Thaotest {
    @Test
    public void test_email() {
        String email = "thao.dp6@onemount.com.vn";
        assertThat(email).isNotNull()
                .containsPattern("^[a-zA-Z][\\w-.]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
    }

    @Test
    public void test_cannang() {
        double kg = 100;
        assertThat(kg).isNotNull()
                .isGreaterThan(0)
                .isLessThanOrEqualTo(200);

    }

    @Test
    public void test_mang() {
        String[] mang = {"111111111", "222222222", "333333333", "444444444", "555555555"};
        for (int i = 0; i < mang.length; i++) {
            assertThat(mang[i]).hasSize(9)
                    .isNotNull()
                    .containsOnlyDigits();
        }
    }
}

