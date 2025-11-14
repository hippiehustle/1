package H6;

import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import I6.s;
import java.util.ArrayList;
import o6.j;
import s7.InterfaceC1521l;

/* loaded from: classes.dex */
public final class d implements InterfaceC1521l {

    /* renamed from: b, reason: collision with root package name */
    public static final d f2040b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final d f2041c = new Object();

    @Override // s7.InterfaceC1521l
    public void a(InterfaceC0002c interfaceC0002c) {
        j.e(interfaceC0002c, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + interfaceC0002c);
    }

    public f b(W6.c cVar) {
        j.e(cVar, "javaElement");
        return new f((s) cVar);
    }

    @Override // s7.InterfaceC1521l
    public void c(InterfaceC0004e interfaceC0004e, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC0004e.getName() + ", unresolved classes " + arrayList);
    }
}
