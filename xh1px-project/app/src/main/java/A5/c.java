package A5;

import a.AbstractC0405a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f302d;

    /* renamed from: e, reason: collision with root package name */
    public int f303e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f304f;

    public /* synthetic */ c(Object obj, int i4, int i8) {
        this.f302d = i8;
        this.f304f = obj;
        this.f303e = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f302d) {
            case 0:
                ((f) this.f304f).j(this.f303e);
                return;
            case 1:
                ((I5.e) this.f304f).k.x(this.f303e, 4);
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                W0.c cVar = (W0.c) this.f304f;
                int i4 = this.f303e;
                G.b bVar = (G.b) cVar.f6486e;
                if (bVar != null) {
                    bVar.g(i4);
                    return;
                }
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                ArrayList arrayList = (ArrayList) this.f304f;
                int size = arrayList.size();
                int i8 = 0;
                if (this.f303e != 1) {
                    while (i8 < size) {
                        ((c0.i) arrayList.get(i8)).a();
                        i8++;
                    }
                    return;
                } else {
                    while (i8 < size) {
                        ((c0.i) arrayList.get(i8)).b();
                        i8++;
                    }
                    return;
                }
            default:
                ((com.google.android.material.datepicker.k) this.f304f).j0.m0(this.f303e);
                return;
        }
    }

    public c(List list, int i4, Throwable th) {
        this.f302d = 3;
        AbstractC0405a.l(list, "initCallbacks cannot be null");
        this.f304f = new ArrayList(list);
        this.f303e = i4;
    }

    public c(I5.e eVar) {
        this.f302d = 1;
        this.f304f = eVar;
        this.f303e = -1;
    }
}
