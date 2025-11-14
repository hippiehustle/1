package K0;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public H.e[] f2563a;

    /* renamed from: b, reason: collision with root package name */
    public String f2564b;

    /* renamed from: c, reason: collision with root package name */
    public int f2565c;

    public l() {
        this.f2563a = null;
        this.f2565c = 0;
    }

    public H.e[] getPathData() {
        return this.f2563a;
    }

    public String getPathName() {
        return this.f2564b;
    }

    public void setPathData(H.e[] eVarArr) {
        H.e[] eVarArr2 = this.f2563a;
        boolean z8 = false;
        if (eVarArr2 != null && eVarArr != null && eVarArr2.length == eVarArr.length) {
            int i4 = 0;
            while (true) {
                if (i4 < eVarArr2.length) {
                    H.e eVar = eVarArr2[i4];
                    char c6 = eVar.f1853a;
                    H.e eVar2 = eVarArr[i4];
                    if (c6 != eVar2.f1853a || eVar.f1854b.length != eVar2.f1854b.length) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    z8 = true;
                    break;
                }
            }
        }
        if (!z8) {
            this.f2563a = D2.f.i(eVarArr);
            return;
        }
        H.e[] eVarArr3 = this.f2563a;
        for (int i8 = 0; i8 < eVarArr.length; i8++) {
            eVarArr3[i8].f1853a = eVarArr[i8].f1853a;
            int i9 = 0;
            while (true) {
                float[] fArr = eVarArr[i8].f1854b;
                if (i9 < fArr.length) {
                    eVarArr3[i8].f1854b[i9] = fArr[i9];
                    i9++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f2563a = null;
        this.f2565c = 0;
        this.f2564b = lVar.f2564b;
        this.f2563a = D2.f.i(lVar.f2563a);
    }
}
