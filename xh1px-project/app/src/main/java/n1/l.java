package n1;

import H7.q;
import I7.m;
import I7.v;
import Z5.y;
import a6.AbstractC0434i;
import a6.AbstractC0438m;
import b6.C0535c;
import h4.AbstractC0832f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n6.InterfaceC1163b;
import o6.u;
import t6.C1588c;

/* loaded from: classes.dex */
public final class l implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f12859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f12860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f12861f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f12862g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Collection f12863h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ArrayList f12864i;
    public final /* synthetic */ LinkedHashSet j;

    public l(h hVar, u uVar, String str, String str2, Collection collection, ArrayList arrayList, LinkedHashSet linkedHashSet) {
        this.f12859d = hVar;
        this.f12860e = uVar;
        this.f12861f = str;
        this.f12862g = str2;
        this.f12863h = collection;
        this.f12864i = arrayList;
        this.j = linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Iterable] */
    @Override // n6.InterfaceC1163b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        String str;
        ?? y4;
        Iterator it;
        j jVar = (j) obj;
        o6.j.e(jVar, "row");
        String obj2 = m.w0(jVar.d(this.f12859d.f12853a)).toString();
        boolean a02 = v.a0(obj2, "CREATE TABLE");
        String str2 = this.f12862g;
        Collection collection = this.f12863h;
        String str3 = this.f12861f;
        if (a02) {
            u uVar = this.f12860e;
            if (uVar.f13642d == null) {
                C0535c i4 = E2.d.i();
                int length = obj2.length();
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        if (obj2.charAt(i8) == '(') {
                            break;
                        }
                        i8++;
                    } else {
                        i8 = -1;
                        break;
                    }
                }
                int i9 = i8 + 1;
                int length2 = obj2.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i10 = length2 - 1;
                        if (obj2.charAt(length2) == ')') {
                            break;
                        }
                        if (i10 < 0) {
                            break;
                        }
                        length2 = i10;
                    }
                    String substring = obj2.substring(i9, length2);
                    o6.j.d(substring, "substring(...)");
                    String[] strArr = {","};
                    str = strArr[0];
                    if (str.length() != 0) {
                        H7.j<C1588c> jVar2 = new H7.j(substring, new C1.b(2, AbstractC0434i.K0(strArr)), 2);
                        y4 = new ArrayList(AbstractC0438m.d0(new q(0, jVar2), 10));
                        for (C1588c c1588c : jVar2) {
                            o6.j.e(c1588c, "range");
                            y4.add(substring.subSequence(c1588c.f15123d, c1588c.f15124e + 1).toString());
                        }
                    } else {
                        int f02 = m.f0(substring, str, 0, false);
                        if (f02 != -1) {
                            y4 = new ArrayList(10);
                            int i11 = 0;
                            do {
                                y4.add(substring.subSequence(i11, f02).toString());
                                i11 = str.length() + f02;
                                f02 = m.f0(substring, str, i11, false);
                            } while (f02 != -1);
                            y4.add(substring.subSequence(i11, substring.length()).toString());
                        } else {
                            y4 = E2.d.y(substring.toString());
                        }
                    }
                    it = y4.iterator();
                    while (it.hasNext()) {
                        String obj3 = m.w0((String) it.next()).toString();
                        int i02 = m.i0(obj3, "`", 0, false, 6) + 1;
                        String substring2 = obj3.substring(i02, m.i0(obj3, "`", i02, false, 4));
                        o6.j.d(substring2, "substring(...)");
                        if (!collection.contains(substring2)) {
                            this.j.add(substring2);
                            i4.add(obj3);
                        }
                    }
                    uVar.f13642d = "CREATE TABLE `" + str2 + "` ( " + AbstractC0832f.l(E2.d.f(i4)) + " )";
                }
                length2 = -1;
                String substring3 = obj2.substring(i9, length2);
                o6.j.d(substring3, "substring(...)");
                String[] strArr2 = {","};
                str = strArr2[0];
                if (str.length() != 0) {
                }
                it = y4.iterator();
                while (it.hasNext()) {
                }
                uVar.f13642d = "CREATE TABLE `" + str2 + "` ( " + AbstractC0832f.l(E2.d.f(i4)) + " )";
            } else {
                throw new IllegalStateException(A.j.o("There is two create table for ", str3));
            }
        } else if (v.a0(obj2, "CREATE INDEX")) {
            int l02 = m.l0(0, 6, obj2, "`");
            String substring4 = obj2.substring(m.l0(l02 - 1, 4, obj2, "`") + 1, l02);
            o6.j.d(substring4, "substring(...)");
            if (!collection.contains(substring4)) {
                this.f12864i.add(v.Z(v.Z(obj2, "\"", "`"), A.j.p("`", str3, "`"), "`" + str2 + "`"));
            }
        }
        return y.f7506a;
    }
}
