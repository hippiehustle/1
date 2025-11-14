package t0;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import h4.AbstractC0832f;
import java.util.ArrayList;
import o.C1207p;
import t6.C1588c;

/* loaded from: classes.dex */
public final class V extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            G1.h hVar = (G1.h) ((Observable) this).mObservers.get(size);
            switch (hVar.f1725a) {
                case 1:
                    RecyclerView recyclerView = (RecyclerView) hVar.f1726b;
                    recyclerView.k(null);
                    recyclerView.f8951k0.f14917f = true;
                    recyclerView.a0(true);
                    if (recyclerView.f8947h.j()) {
                        break;
                    } else {
                        recyclerView.requestLayout();
                        break;
                    }
            }
        }
    }

    public final void c(int i4, int i8) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            G1.h hVar = (G1.h) ((Observable) this).mObservers.get(size);
            switch (hVar.f1725a) {
                case 1:
                    RecyclerView recyclerView = (RecyclerView) hVar.f1726b;
                    recyclerView.k(null);
                    C1207p c1207p = recyclerView.f8947h;
                    ArrayList arrayList = (ArrayList) c1207p.f13344c;
                    if (i4 == i8) {
                        break;
                    } else {
                        arrayList.add(c1207p.l(8, i4, i8));
                        c1207p.f13342a = 8 | c1207p.f13342a;
                        if (arrayList.size() == 1) {
                            hVar.e();
                            break;
                        } else {
                            break;
                        }
                    }
            }
        }
    }

    public final void d(int i4, int i8) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            G1.h hVar = (G1.h) ((Observable) this).mObservers.get(size);
            switch (hVar.f1725a) {
                case 1:
                    RecyclerView recyclerView = (RecyclerView) hVar.f1726b;
                    recyclerView.k(null);
                    C1207p c1207p = recyclerView.f8947h;
                    ArrayList arrayList = (ArrayList) c1207p.f13344c;
                    if (i8 < 1) {
                        break;
                    } else {
                        arrayList.add(c1207p.l(4, i4, i8));
                        c1207p.f13342a = 4 | c1207p.f13342a;
                        if (arrayList.size() == 1) {
                            hVar.e();
                            break;
                        } else {
                            break;
                        }
                    }
            }
        }
    }

    public final void e(int i4, int i8) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            G1.h hVar = (G1.h) ((Observable) this).mObservers.get(size);
            switch (hVar.f1725a) {
                case 0:
                    G1.j jVar = (G1.j) hVar.f1726b;
                    if (!jVar.f1731g) {
                        Integer num = jVar.f1732h;
                        if (num != null) {
                            C1588c G8 = AbstractC0832f.G(1, i8);
                            int intValue = num.intValue();
                            if (G8.f15123d <= intValue && intValue <= G8.f15124e) {
                                jVar.h(num.intValue());
                            }
                        }
                        jVar.f1731g = true;
                        break;
                    } else {
                        jVar.h((i4 + i8) - 1);
                        break;
                    }
                    break;
                default:
                    RecyclerView recyclerView = (RecyclerView) hVar.f1726b;
                    recyclerView.k(null);
                    C1207p c1207p = recyclerView.f8947h;
                    ArrayList arrayList = (ArrayList) c1207p.f13344c;
                    if (i8 < 1) {
                        break;
                    } else {
                        arrayList.add(c1207p.l(1, i4, i8));
                        c1207p.f13342a |= 1;
                        if (arrayList.size() == 1) {
                            hVar.e();
                            break;
                        } else {
                            break;
                        }
                    }
            }
        }
    }

    public final void f(int i4, int i8) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            G1.h hVar = (G1.h) ((Observable) this).mObservers.get(size);
            switch (hVar.f1725a) {
                case 1:
                    RecyclerView recyclerView = (RecyclerView) hVar.f1726b;
                    recyclerView.k(null);
                    C1207p c1207p = recyclerView.f8947h;
                    ArrayList arrayList = (ArrayList) c1207p.f13344c;
                    if (i8 < 1) {
                        break;
                    } else {
                        arrayList.add(c1207p.l(2, i4, i8));
                        c1207p.f13342a = 2 | c1207p.f13342a;
                        if (arrayList.size() == 1) {
                            hVar.e();
                            break;
                        } else {
                            break;
                        }
                    }
            }
        }
    }
}
