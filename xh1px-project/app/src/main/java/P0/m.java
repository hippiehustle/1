package P0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class m implements n, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f4393a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f4394b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f4395c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4396d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final U0.g f4397e;

    public m(U0.g gVar) {
        this.f4397e = gVar;
    }

    public final void b(Path.Op op) {
        Path path = this.f4394b;
        path.reset();
        Path path2 = this.f4393a;
        path2.reset();
        ArrayList arrayList = this.f4396d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar instanceof e) {
                e eVar = (e) nVar;
                ArrayList arrayList2 = (ArrayList) eVar.d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path f8 = ((n) arrayList2.get(size2)).f();
                    Matrix matrix = eVar.f4339d;
                    Q0.q qVar = eVar.f4345l;
                    if (qVar != null) {
                        matrix = qVar.e();
                    } else {
                        matrix.reset();
                    }
                    f8.transform(matrix);
                    path.addPath(f8);
                }
            } else {
                path.addPath(nVar.f());
            }
        }
        int i4 = 0;
        n nVar2 = (n) arrayList.get(0);
        if (nVar2 instanceof e) {
            e eVar2 = (e) nVar2;
            List d2 = eVar2.d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) d2;
                if (i4 >= arrayList3.size()) {
                    break;
                }
                Path f9 = ((n) arrayList3.get(i4)).f();
                Matrix matrix2 = eVar2.f4339d;
                Q0.q qVar2 = eVar2.f4345l;
                if (qVar2 != null) {
                    matrix2 = qVar2.e();
                } else {
                    matrix2.reset();
                }
                f9.transform(matrix2);
                path2.addPath(f9);
                i4++;
            }
        } else {
            path2.set(nVar2.f());
        }
        this.f4395c.op(path2, path, op);
    }

    @Override // P0.d
    public final void c(List list, List list2) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4396d;
            if (i4 < arrayList.size()) {
                ((n) arrayList.get(i4)).c(list, list2);
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // P0.k
    public final void d(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            d dVar = (d) listIterator.previous();
            if (dVar instanceof n) {
                this.f4396d.add((n) dVar);
                listIterator.remove();
            }
        }
    }

    @Override // P0.n
    public final Path f() {
        Path path = this.f4395c;
        path.reset();
        U0.g gVar = this.f4397e;
        if (!gVar.f5969b) {
            int b4 = AbstractC1769h.b(gVar.f5968a);
            if (b4 != 0) {
                if (b4 != 1) {
                    if (b4 != 2) {
                        if (b4 != 3) {
                            if (b4 == 4) {
                                b(Path.Op.XOR);
                                return path;
                            }
                        } else {
                            b(Path.Op.INTERSECT);
                            return path;
                        }
                    } else {
                        b(Path.Op.REVERSE_DIFFERENCE);
                        return path;
                    }
                } else {
                    b(Path.Op.UNION);
                    return path;
                }
            } else {
                int i4 = 0;
                while (true) {
                    ArrayList arrayList = this.f4396d;
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((n) arrayList.get(i4)).f());
                    i4++;
                }
            }
        }
        return path;
    }
}
