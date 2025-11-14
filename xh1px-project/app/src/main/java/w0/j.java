package w0;

import a6.AbstractC0436k;
import d6.InterfaceC0622h;
import f6.AbstractC0713c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements D0.a, U7.a {

    /* renamed from: d, reason: collision with root package name */
    public final D0.a f15595d;

    /* renamed from: e, reason: collision with root package name */
    public final U7.a f15596e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0622h f15597f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f15598g;

    public j(D0.a aVar) {
        U7.c cVar = new U7.c();
        o6.j.e(aVar, "delegate");
        this.f15595d = aVar;
        this.f15596e = cVar;
    }

    @Override // D0.a
    public final D0.c L(String str) {
        o6.j.e(str, "sql");
        return this.f15595d.L(str);
    }

    @Override // U7.a
    public final void a(Object obj) {
        this.f15596e.a(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f15595d.close();
    }

    @Override // U7.a
    public final Object d(AbstractC0713c abstractC0713c) {
        return this.f15596e.d(abstractC0713c);
    }

    public final void e(StringBuilder sb) {
        List list;
        if (this.f15597f == null && this.f15598g == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        InterfaceC0622h interfaceC0622h = this.f15597f;
        if (interfaceC0622h != null) {
            sb.append("\t\tCoroutine: " + interfaceC0622h);
            sb.append('\n');
        }
        Throwable th = this.f15598g;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            o6.j.d(stringWriter2, "toString(...)");
            I7.g gVar = new I7.g(stringWriter2);
            if (!gVar.hasNext()) {
                list = a6.s.f7766d;
            } else {
                Object next = gVar.next();
                if (!gVar.hasNext()) {
                    list = E2.d.y(next);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (gVar.hasNext()) {
                        arrayList.add(gVar.next());
                    }
                    list = arrayList;
                }
            }
            Iterator it = AbstractC0436k.m0(list).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.f15595d.toString();
    }
}
