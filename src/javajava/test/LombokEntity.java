package javajava.test;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class LombokEntity {
    private String id;
    private String pw;

    private LombokEntity lombokEntity;

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch(Exception e) {
        }
        return obj;
    }
}
