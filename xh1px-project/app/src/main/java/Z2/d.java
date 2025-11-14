package Z2;

import G5.e;
import I7.k;
import T1.C;
import T1.C0313l;
import T1.C0316o;
import T1.r;
import T1.s;
import android.graphics.Point;
import android.util.Log;
import b6.C0541i;
import java.io.File;
import java.util.List;
import java.util.Set;
import o6.j;
import q4.X;

/* loaded from: classes.dex */
public final class d extends W2.a {

    /* renamed from: f, reason: collision with root package name */
    public final File f7312f;

    /* renamed from: g, reason: collision with root package name */
    public final k f7313g;

    /* renamed from: h, reason: collision with root package name */
    public final k f7314h;

    /* renamed from: i, reason: collision with root package name */
    public final k f7315i;
    public boolean j;
    public final e k;

    public d(File file) {
        super(file);
        this.f7312f = file;
        this.f7313g = new k("[0-9]+/[0-9]+.json");
        this.f7314h = new k("[0-9]+/Condition_-?[0-9]+.png");
        this.f7315i = new k("[0-9]+/Condition_-?[0-9]+");
        this.k = new e(11);
    }

    @Override // W2.a
    public final Object b(Object obj, Point point) {
        j.e(point, "screenSize");
        return new c(18, point.x, point.y, (C0316o) obj);
    }

    @Override // W2.a
    public final Set d(Object obj) {
        C0541i c0541i = new C0541i();
        for (C0313l c0313l : ((C0316o) obj).f5610b) {
            if (c0313l.f5604a.f5658g == C.f5507d) {
                for (r rVar : c0313l.f5606c) {
                    if (rVar.f5616d == s.f5638f) {
                        String str = rVar.f5618f;
                        j.b(str);
                        c0541i.add(str);
                    }
                }
            }
        }
        return X.j(c0541i);
    }

    @Override // W2.a
    public final String e(Object obj) {
        return ((C0316o) obj).f5609a.f5528a + ".json";
    }

    @Override // W2.a
    public final String f(Object obj) {
        return String.valueOf(((C0316o) obj).f5609a.f5528a);
    }

    @Override // W2.a
    public final W2.b g() {
        return this.k;
    }

    @Override // W2.a
    public final boolean h(String str) {
        if (!this.f7314h.c(str) && !this.f7315i.c(str)) {
            return false;
        }
        return true;
    }

    @Override // W2.a
    public final boolean i(String str) {
        return this.f7313g.c(str);
    }

    @Override // W2.a
    public final void j() {
        super.j();
        this.j = false;
    }

    @Override // W2.a
    public final Object k(Object obj, Point point) {
        c cVar = (c) obj;
        j.e(cVar, "backup");
        j.e(point, "screenSize");
        C0316o c0316o = cVar.f7311d;
        Log.i("SmartBackupEngine", "Verifying smart scenario " + c0316o.f5609a.f5528a);
        for (C0313l c0313l : c0316o.f5610b) {
            List list = c0313l.f5605b;
            List<r> list2 = c0313l.f5606c;
            if (list.isEmpty()) {
                Log.w("SmartBackupEngine", "Invalid scenario, action list is empty.");
                return null;
            }
            if (list2.isEmpty()) {
                Log.w("SmartBackupEngine", "Invalid scenario, condition list is empty.");
                return null;
            }
            for (r rVar : list2) {
                s sVar = rVar.f5616d;
                String str = rVar.f5618f;
                if (sVar == s.f5638f && (str == null || !new File(this.f7312f, str).exists())) {
                    Log.w("SmartBackupEngine", "Invalid screen condition, " + str + " file does not exist.");
                    return null;
                }
            }
        }
        if (!this.j) {
            this.j = !point.equals(new Point(cVar.f7309b, cVar.f7310c));
        }
        Log.i("SmartBackupEngine", "Smart scenario is valid, has warnings: " + this.j);
        return c0316o;
    }
}
