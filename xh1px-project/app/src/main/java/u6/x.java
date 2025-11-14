package u6;

import java.lang.reflect.Type;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class x extends o6.i implements InterfaceC1163b {

    /* renamed from: l, reason: collision with root package name */
    public static final x f15379l = new o6.i(1, AbstractC1638C.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        Type type = (Type) obj;
        o6.j.e(type, "p0");
        return AbstractC1638C.h(type);
    }
}
