package I6;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* loaded from: classes.dex */
public final class u extends w {

    /* renamed from: a, reason: collision with root package name */
    public final Field f2214a;

    public u(Field field) {
        o6.j.e(field, "member");
        this.f2214a = field;
    }

    @Override // I6.w
    public final Member b() {
        return this.f2214a;
    }
}
