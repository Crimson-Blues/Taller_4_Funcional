import SubsecuenciaMasLarga ._

// ************************** Secuencias Predefinidas **************************
val s = Seq(20, 30, 10, 40, 15, 16, 17)
val s1 = Seq(10, 20, 30)
val s2 = Seq(20, 30, 10)
val s3 = Seq(10, 15, 15)

// ************************** subindices **************************
subindices(3,3)
subindices(0,2)
subindices(5,3)
subindices(2,3)
subindices(0,4)

// ************************** subSecuenciaAsoc **************************
subSecuenciaAsoc(s, Seq(1))
subSecuenciaAsoc(s, Seq())
subSecuenciaAsoc(s, Seq(0, 2, 4))
subSecuenciaAsoc(s, Seq(1, 3, 4, 6))
subSecuenciaAsoc(s, Seq(0, 1, 2, 3, 4, 5, 6))

// ************************** subSecuenciasDe **************************
subSecuenciasDe(Seq())
subSecuenciasDe(Seq(7))
subSecuenciasDe(s1)
subSecuenciasDe(s2)
subSecuenciasDe(s3)

// ************************** incremental **************************
incremental(Seq(10, 15, 16, 17))
incremental(Seq(30, 10, 40))
incremental(Seq(20, 10))
incremental(Seq(20,20))
incremental(Seq(10))
incremental(Seq())


// ************************** subSecuenciasInc **************************
subSecuenciasInc(s)
subSecuenciasInc(s1)


// ************************** subSecuenciaIncrementalMasLarga **************************
subsecuenciaIncrementalMasLarga(s)
subsecuenciaIncrementalMasLarga(s1)
subsecuenciaIncrementalMasLarga(s2)


// ************************** ssimlComenzandoEn **************************





// ************************** subSecIncMasLargaV2 **************************