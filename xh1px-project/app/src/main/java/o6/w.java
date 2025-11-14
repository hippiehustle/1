package o6;

import u6.InterfaceC1642c;
import u6.InterfaceC1644e;
import u6.InterfaceC1645f;

/* loaded from: classes.dex */
public class w {
    public InterfaceC1642c b(Class cls) {
        return new C1286e(cls);
    }

    public InterfaceC1644e c(Class cls) {
        return new n(cls);
    }

    public String g(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public String h(l lVar) {
        return g(lVar);
    }

    public InterfaceC1645f a(i iVar) {
        return iVar;
    }

    public u6.i d(m mVar) {
        return mVar;
    }

    public u6.p e(o oVar) {
        return oVar;
    }

    public u6.r f(p pVar) {
        return pVar;
    }
}
