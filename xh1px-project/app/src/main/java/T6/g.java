package T6;

import C6.AbstractC0021w;
import C6.T;
import a6.AbstractC0438m;
import java.util.ArrayList;
import java.util.Iterator;
import m7.AbstractC1098d;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class g implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5833d;

    /* renamed from: e, reason: collision with root package name */
    public final i f5834e;

    public /* synthetic */ g(i iVar, int i4) {
        this.f5833d = i4;
        this.f5834e = iVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f5833d) {
            case 0:
                i iVar = this.f5834e;
                if (AbstractC1098d.f(iVar) != null) {
                    ((S6.a) iVar.j.f280e).f5418w.getClass();
                    return null;
                }
                return null;
            case 1:
                i iVar2 = this.f5834e;
                I6.o oVar = iVar2.k;
                ArrayList typeParameters = oVar.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    I6.C c6 = (I6.C) it.next();
                    T a3 = ((S6.f) iVar2.f5839m.f281f).a(c6);
                    if (a3 != null) {
                        arrayList.add(a3);
                    } else {
                        throw new AssertionError("Parameter " + c6 + " surely belongs to class " + oVar + ", so it must be resolved");
                    }
                }
                return arrayList;
            default:
                return AbstractC0021w.c(this.f5834e);
        }
    }
}
