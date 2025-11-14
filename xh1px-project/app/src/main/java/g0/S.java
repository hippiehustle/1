package g0;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class S implements O {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10881a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f10883c;

    public /* synthetic */ S(T t8, String str, int i4) {
        this.f10881a = i4;
        this.f10883c = t8;
        this.f10882b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r8 != 8) goto L34;
     */
    @Override // g0.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        String str2;
        int i4;
        Iterator it;
        switch (this.f10881a) {
            case 0:
                T t8 = this.f10883c;
                C0734c c0734c = (C0734c) t8.f10909l.remove(this.f10882b);
                boolean z8 = false;
                if (c0734c != null) {
                    HashMap hashMap = new HashMap();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C0732a c0732a = (C0732a) it2.next();
                        if (c0732a.f10969u) {
                            Iterator it3 = c0732a.f10951a.iterator();
                            while (it3.hasNext()) {
                                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = ((c0) it3.next()).f10994b;
                                if (abstractComponentCallbacksC0755y != null) {
                                    hashMap.put(abstractComponentCallbacksC0755y.f11114h, abstractComponentCallbacksC0755y);
                                }
                            }
                        }
                    }
                    ArrayList<String> arrayList3 = c0734c.f10991d;
                    HashMap hashMap2 = new HashMap(arrayList3.size());
                    for (String str3 : arrayList3) {
                        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = (AbstractComponentCallbacksC0755y) hashMap.get(str3);
                        if (abstractComponentCallbacksC0755y2 != null) {
                            hashMap2.put(abstractComponentCallbacksC0755y2.f11114h, abstractComponentCallbacksC0755y2);
                        } else {
                            Bundle r8 = t8.f10902c.r(str3, null);
                            if (r8 != null) {
                                ClassLoader classLoader = t8.f10921x.j.getClassLoader();
                                AbstractComponentCallbacksC0755y a3 = ((Z) r8.getParcelable("state")).a(t8.I());
                                a3.f11111e = r8;
                                if (r8.getBundle("savedInstanceState") == null) {
                                    a3.f11111e.putBundle("savedInstanceState", new Bundle());
                                }
                                Bundle bundle = r8.getBundle("arguments");
                                if (bundle != null) {
                                    bundle.setClassLoader(classLoader);
                                }
                                a3.R(bundle);
                                hashMap2.put(a3.f11114h, a3);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (C0733b c0733b : c0734c.f10992e) {
                        ArrayList arrayList5 = c0733b.f10976e;
                        C0732a c0732a2 = new C0732a(t8);
                        c0733b.a(c0732a2);
                        for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                            String str4 = (String) arrayList5.get(i8);
                            if (str4 != null) {
                                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y3 = (AbstractComponentCallbacksC0755y) hashMap2.get(str4);
                                if (abstractComponentCallbacksC0755y3 != null) {
                                    ((c0) c0732a2.f10951a.get(i8)).f10994b = abstractComponentCallbacksC0755y3;
                                } else {
                                    throw new IllegalStateException("Restoring FragmentTransaction " + c0733b.f10980i + " failed due to missing saved state for Fragment (" + str4 + ")");
                                }
                            }
                        }
                        arrayList4.add(c0732a2);
                    }
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        ((C0732a) it4.next()).a(arrayList, arrayList2);
                        z8 = true;
                    }
                }
                return z8;
            default:
                T t9 = this.f10883c;
                String str5 = this.f10882b;
                int C8 = t9.C(str5, -1, true);
                if (C8 < 0) {
                    return false;
                }
                int i9 = C8;
                while (true) {
                    Throwable th = null;
                    if (i9 < t9.f10903d.size()) {
                        C0732a c0732a3 = (C0732a) t9.f10903d.get(i9);
                        if (c0732a3.f10964p) {
                            i9++;
                        } else {
                            t9.g0(new IllegalArgumentException("saveBackStack(\"" + str5 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c0732a3 + " that did not use setReorderingAllowed(true)."));
                            throw null;
                        }
                    } else {
                        HashSet hashSet = new HashSet();
                        int i10 = C8;
                        while (i10 < t9.f10903d.size()) {
                            C0732a c0732a4 = (C0732a) t9.f10903d.get(i10);
                            HashSet hashSet2 = new HashSet();
                            HashSet hashSet3 = new HashSet();
                            Iterator it5 = c0732a4.f10951a.iterator();
                            while (it5.hasNext()) {
                                c0 c0Var = (c0) it5.next();
                                Throwable th2 = th;
                                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y4 = c0Var.f10994b;
                                if (abstractComponentCallbacksC0755y4 == null) {
                                    th = th2;
                                } else {
                                    if (c0Var.f10995c) {
                                        i4 = i10;
                                        int i11 = c0Var.f10993a;
                                        it = it5;
                                        if (i11 != 1) {
                                            if (i11 != 2) {
                                                break;
                                            }
                                        }
                                    } else {
                                        i4 = i10;
                                        it = it5;
                                    }
                                    hashSet.add(abstractComponentCallbacksC0755y4);
                                    hashSet2.add(abstractComponentCallbacksC0755y4);
                                    int i12 = c0Var.f10993a;
                                    if (i12 == 1 || i12 == 2) {
                                        hashSet3.add(abstractComponentCallbacksC0755y4);
                                    }
                                    th = th2;
                                    i10 = i4;
                                    it5 = it;
                                }
                            }
                            int i13 = i10;
                            Throwable th3 = th;
                            hashSet2.removeAll(hashSet3);
                            if (!hashSet2.isEmpty()) {
                                StringBuilder s8 = A.j.s("saveBackStack(\"", str5, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                                if (hashSet2.size() == 1) {
                                    str2 = " " + hashSet2.iterator().next();
                                } else {
                                    str2 = "s " + hashSet2;
                                }
                                s8.append(str2);
                                s8.append(" in ");
                                s8.append(c0732a4);
                                s8.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                                t9.g0(new IllegalArgumentException(s8.toString()));
                                throw th3;
                            }
                            i10 = i13 + 1;
                            th = th3;
                        }
                        Throwable th4 = th;
                        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                        while (!arrayDeque.isEmpty()) {
                            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y5 = (AbstractComponentCallbacksC0755y) arrayDeque.removeFirst();
                            if (abstractComponentCallbacksC0755y5.f11091G) {
                                StringBuilder s9 = A.j.s("saveBackStack(\"", str5, "\") must not contain retained fragments. Found ");
                                if (hashSet.contains(abstractComponentCallbacksC0755y5)) {
                                    str = "direct reference to retained ";
                                } else {
                                    str = "retained child ";
                                }
                                s9.append(str);
                                s9.append("fragment ");
                                s9.append(abstractComponentCallbacksC0755y5);
                                t9.g0(new IllegalArgumentException(s9.toString()));
                                throw th4;
                            }
                            Iterator it6 = abstractComponentCallbacksC0755y5.f11130z.f10902c.i().iterator();
                            while (it6.hasNext()) {
                                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y6 = (AbstractComponentCallbacksC0755y) it6.next();
                                if (abstractComponentCallbacksC0755y6 != null) {
                                    arrayDeque.addLast(abstractComponentCallbacksC0755y6);
                                }
                            }
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it7 = hashSet.iterator();
                        while (it7.hasNext()) {
                            arrayList6.add(((AbstractComponentCallbacksC0755y) it7.next()).f11114h);
                        }
                        ArrayList arrayList7 = new ArrayList(t9.f10903d.size() - C8);
                        for (int i14 = C8; i14 < t9.f10903d.size(); i14++) {
                            arrayList7.add(th4);
                        }
                        C0734c c0734c2 = new C0734c(arrayList6, arrayList7);
                        for (int size = t9.f10903d.size() - 1; size >= C8; size--) {
                            C0732a c0732a5 = (C0732a) t9.f10903d.remove(size);
                            C0732a c0732a6 = new C0732a(c0732a5);
                            c0732a6.d();
                            arrayList7.set(size - C8, new C0733b(c0732a6));
                            c0732a5.f10969u = true;
                            arrayList.add(c0732a5);
                            arrayList2.add(Boolean.TRUE);
                        }
                        t9.f10909l.put(str5, c0734c2);
                        return true;
                    }
                }
        }
    }
}
