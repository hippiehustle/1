package X2;

import I7.k;
import a6.u;
import android.graphics.Point;
import android.util.Log;
import java.io.File;
import java.util.Set;
import n1.AbstractC1149a;
import n2.s;
import o6.j;
import t7.C1594d;

/* loaded from: classes.dex */
public final class a extends W2.a {

    /* renamed from: f, reason: collision with root package name */
    public final k f6857f;

    /* renamed from: g, reason: collision with root package name */
    public final C1594d f6858g;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, t7.d] */
    public a(File file) {
        super(file);
        this.f6857f = new k("dumb-[0-9]+/[0-9]+.json");
        this.f6858g = new Object();
    }

    @Override // W2.a
    public final Object b(Object obj, Point point) {
        j.e(point, "screenSize");
        return new d(2, point.x, point.y, (s) obj);
    }

    @Override // W2.a
    public final Set d(Object obj) {
        return u.f7768d;
    }

    @Override // W2.a
    public final String e(Object obj) {
        return ((s) obj).f12925a.f12911a + ".json";
    }

    @Override // W2.a
    public final String f(Object obj) {
        return AbstractC1149a.f("dumb-", ((s) obj).f12925a.f12911a);
    }

    @Override // W2.a
    public final W2.b g() {
        return this.f6858g;
    }

    @Override // W2.a
    public final boolean h(String str) {
        return false;
    }

    @Override // W2.a
    public final boolean i(String str) {
        return this.f6857f.c(str);
    }

    @Override // W2.a
    public final Object k(Object obj, Point point) {
        d dVar = (d) obj;
        j.e(dVar, "backup");
        j.e(point, "screenSize");
        s sVar = dVar.f6863d;
        Log.i("DumbBackupEngine", "Verifying dumb scenario " + sVar.f12925a.f12911a);
        if (sVar.f12926b.isEmpty()) {
            Log.w("DumbBackupEngine", "Invalid dumb scenario, dumb action list is empty.");
            return null;
        }
        return sVar;
    }
}
