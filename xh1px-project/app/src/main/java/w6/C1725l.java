package w6;

import I6.AbstractC0065d;
import h6.AbstractC0837b;
import java.lang.reflect.Field;

/* renamed from: w6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1725l extends AbstractC0837b {

    /* renamed from: a, reason: collision with root package name */
    public final Field f15870a;

    public C1725l(Field field) {
        o6.j.e(field, "field");
        this.f15870a = field;
    }

    @Override // h6.AbstractC0837b
    public final String a() {
        StringBuilder sb = new StringBuilder();
        Field field = this.f15870a;
        String name = field.getName();
        o6.j.d(name, "getName(...)");
        sb.append(P6.v.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        o6.j.d(type, "getType(...)");
        sb.append(AbstractC0065d.b(type));
        return sb.toString();
    }
}
