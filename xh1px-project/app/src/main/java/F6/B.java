package F6;

import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a7.Z;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final List f1448a;

    public B(Z z8) {
        o6.j.e(z8, "typeTable");
        List list = z8.f7996f;
        if ((z8.f7995e & 1) == 1) {
            int i4 = z8.f7997g;
            o6.j.d(list, "getTypeList(...)");
            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
            int i8 = 0;
            for (Object obj : list) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    AbstractC0437l.c0();
                    throw null;
                }
                a7.T t8 = (a7.T) obj;
                if (i8 >= i4) {
                    t8.getClass();
                    a7.S r8 = a7.T.r(t8);
                    r8.f7919g |= 2;
                    r8.f7921i = true;
                    t8 = r8.g();
                    if (!t8.b()) {
                        throw new UninitializedMessageException();
                    }
                }
                arrayList.add(t8);
                i8 = i9;
            }
            list = arrayList;
        }
        o6.j.d(list, "run(...)");
        this.f1448a = list;
    }

    public a7.T a(int i4) {
        return (a7.T) this.f1448a.get(i4);
    }

    public B(List list) {
        this.f1448a = list;
    }
}
