package M;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements O.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3280b;

    public /* synthetic */ f(int i4, Object obj) {
        this.f3279a = i4;
        this.f3280b = obj;
    }

    @Override // O.a
    public final void accept(Object obj) {
        switch (this.f3279a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((A.i) this.f3280b).f(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f3285c) {
                    try {
                        t.j jVar = h.f3286d;
                        ArrayList arrayList = (ArrayList) jVar.get((String) this.f3280b);
                        if (arrayList != null) {
                            jVar.remove((String) this.f3280b);
                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                ((O.a) arrayList.get(i4)).accept(gVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
