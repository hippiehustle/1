package I6;

import java.lang.reflect.Field;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class m extends o6.i implements InterfaceC1163b {

    /* renamed from: l, reason: collision with root package name */
    public static final m f2206l = new o6.i(1, u.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        Field field = (Field) obj;
        o6.j.e(field, "p0");
        return new u(field);
    }
}
